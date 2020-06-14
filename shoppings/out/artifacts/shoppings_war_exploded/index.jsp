<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/26
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>
<script type="text/javascript" src="js/jquery-1.4.3.min.js"></script>
<script>
function commits() {
  $.getJSON("tree/select",function (res) {
    alert("-----");
  })
}

function tiaozhuan(){
  $.getJSON("tree/tiaozhuan",function(res){



  });

}
/*function selectNav(){
  $.getJSON("nav/navlist",{"id":"1"},function(res){
           alert(res);


  });

}*/

function httpTiao(){

  window.location="tree/httpTiao";
}

function chongdingx(){
  window.location="tree/chongDing";

}
function selectNav(){
  window.location="nav/navlist?id=1";
}

function navInsert(){

  window.location="nav/navInsert";
}

////////////----------------------------------------------

//查询分类
function selectClass(){
  window.location="cify/selectClassify";

}

//查询分类明细
function selectClassifys(){
    window.location="cifys/selectClassifys?classify_id=2";
}

function detectionUser(){

    var yu={};
  var username='宋三波';
  var useropenid='afasgagzcvxzb123';

    var local="yus/detectionUser?username="+username+"&useropenid="+useropenid;
  //  alert(local)
    window.location=local;
}

function saveClassifysToShoppingCar(){

  var local="sc/sctsc?userid="+17+"&classifysid="+7+"&quantity="+3;
  window.location=local;
}

//查询地址
function selectShoppingCar(){
    window.location = "sc/selectShoppingCar?userid=20"
}


function ifUserLocationExist(){
  window.location="ulc/ifUserLocationExist?shippingAddress=辉县市百泉镇太阳石小区1号楼&userId=1&shippingPerpson=杜伟@231&shippingPhone=43999879999&useropenid=afasgagzcvxzb123";

}

function CreateOrderForm(){
  var classifysidString=[];
  classifysidString.push(4);
  classifysidString.push(32);
  classifysidString.push(6);


  var c=JSON.stringify(classifysidString);
  window.location="ofc/CreateOrderForm?classifysidString="+c+"&userid="+1

 /* $.getJSON("ofc/CreateOrderForm",{"classifysidString":"'"+c+"'"},function(res){
    alert(res);


  });*/
}

</script>
  </head>
  <body>
  <input type="button"  value="查看" onclick="commits()" />
  <input type="button"  value="跳转" onclick="tiaozhuan()" />
  <input type="button"  value="http跳转" onclick="httpTiao()" />
  <input type="button"  value="http跳转" onclick="chongdingx()" />

  <input type="button"  value="小程序查询" onclick="selectNav()" />

  <input type="button"  value="插入" onclick="navInsert()" />
  <a href="demo.jsp">222</a>
  <br/>

  <input type="button"  value="查询分类" onclick="selectClass()" />

  <input type="button"  value="查询分类明细" onclick="selectClassifys()" />

  <input type="button" value="查询用户是否存在" onclick="detectionUser()" />

  <input type="button" value="插入购物车" onclick="saveClassifysToShoppingCar()" />

  <input type="button" value="查询购物车商品" onclick="selectShoppingCar()" />

  <input type="button" value="判断地址是否存在" onclick="ifUserLocationExist()" />

  <input type="button" value="生成订单" onclick="CreateOrderForm()" />

  <img src="detail/ker/k2.jpg" />
  </body>
</html>
