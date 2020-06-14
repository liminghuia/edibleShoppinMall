// page/component/new-pages/user/user.js
const app=getApp()
Page({
  data:{
    //姓名:nickname,唯一标识:openid,需要传入后台，做用户记录
    thumb:'',
    nickname:'',
    openid:'',
    orders:[],
    hasAddress:false,
    address:{},
    appdata:app.globalData//拿到全局变量 到时候就方便直接用appdata去获取到app.js中的具体变量
  },
//    getData:function(){
//     //  this.setData({
//     //    appdata:'shidn'
//     // })
//        app.globalData.demo = duwei;//这步不可以省略
//  console.log("测试:"+app.globalData.demo)

//    },
  onLoad(){
    app.globalData.demo = 'duwei';
    var asd = app.globalData.demo;
    console.log("测试:"+asd)
    var self = this;
    var that = this;
    var code = this;
    var url=null;
    /**
     * 获取用户信息
     */
    wx.getUserInfo({
      success: function(res){
        self.setData({
          thumb: res.userInfo.avatarUrl,
          nickname: res.userInfo.nickName
        }),
        console.log(res.userInfo.avatarUrl),
        console.log(res.userInfo.nickName)
        
      },
      
    }),


    //sc/deleteShoppingCar?userid=?&classifysid=?
    wx.login({
      success: function(res){
        // 发送 res.code 到后台换取 openId, sessionKey, unionId
         console.log(res)
        //var appid = 'wxae408ccae23a1197'; //填写微信小程序appid 
        //var secret = '45d7f8e8653a6443afe8f50be0da7755'; //填写微信小程序secret 
        var appid= 'wx68a23040abc79adc';
        var secret= '824e0425235794a3a6328b4e8c40babf';
        //调用request请求api转换登录凭证 
        wx.request({
          url: 'https://api.weixin.qq.com/sns/jscode2session?appid='+appid+'&secret='+secret+'&grant_type=authorization_code&js_code=' + res.code,
          header: {
            'content-type': 'application/json'
          },
          success: function (res) {
            self.setData({
            openid : res.data.openid
            
            }),
            console.log(res.data.openid) //获取openid 
          }
        }) 
      }
    }),
    
  
   



    /**
     * 发起请求获取订单列表信息
     */
    wx.request({
      url: 'http://www.gdfengshuo.com/api/wx/orders.txt',
      success(res){
        self.setData({
          orders: res.data
        })
      }
    })
  },
  onShow(){
    var self = this;
    /**
     * 获取本地缓存 地址信息
     */
    wx.getStorage({
      key: 'address',
      success: function(res){
        self.setData({
          hasAddress: true,
          address: res.data
        })
      }
    })
  },
  /**
   * 发起支付请求
   */
  payOrders(){
    wx.requestPayment({
      timeStamp: 'String1',
      nonceStr: 'String2',
      package: 'String3',
      signType: 'MD5',
      paySign: 'String4',
      success: function(res){
        console.log(res)
      },
      fail: function(res) {
        wx.showModal({
          title:'支付提示',
          content:'<text>',
          showCancel: false
        })
      }
    })
  },
  
})