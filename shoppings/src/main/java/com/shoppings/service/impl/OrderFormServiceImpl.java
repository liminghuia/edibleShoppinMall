package com.shoppings.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.shoppings.dao.IOrderFormDao;
import com.shoppings.dao.IShoppingCarDao;
import com.shoppings.model.OrderForm;
import com.shoppings.model.ShoppingCar;
import com.shoppings.service.IOrderFormService;
import com.shoppings.util.OrderCodeFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Service
public class OrderFormServiceImpl implements IOrderFormService {

    //注入购物车Dao
    @Resource
    private IShoppingCarDao iscd;

    //注入订单Dao
    @Resource
    private IOrderFormDao iofd;

     //根据商品id修改购物车商品状态
    public Integer updateShoppingCarState( String classifysidString, Integer userid){
        Integer integer = 0;

        System.out.println(classifysidString+"-----"+userid);

        //将字符串解析为list集合
        Gson gson = new Gson();
        List<Integer> classifysidList =gson.fromJson(classifysidString, new TypeToken<List<Integer>>() {}.getType());

        //过滤传过来参数为空或者不存在
        if(classifysidList.size() > 0 && userid != 0 && userid != null){
            for (int i = 0; i < classifysidList.size(); i++){
                Integer classifysid = classifysidList.get(i);
                //获取订单号
                Integer  userids = userid + classifysid;
                String orderCode = OrderCodeFactory.getOrderCode(userids);

                //将购物车中标签修改为历史购物
                ShoppingCar car = new ShoppingCar();
                car.setUserid(userid);
                car.setClassifysid(classifysid);
                car.setOrdernumber(orderCode);
                integer += iscd.updateShoppingCarState(car);

                if(integer!=0){
                    //生成订单
                    OrderForm of = new OrderForm();
                    of.setOrderNumber(orderCode);
                    of.setOrderState("0");
                    iofd.saveOrderform(of);
                }

            }
        }
        System.out.println(integer);
        return integer;
    }


    /**
     * 查看当前用户的订单信息
     * @param userid
     * @return
     */
    public List<Map<String,Object>> selectNowOrderForm(Integer userid){


        return iofd.selectNowOrderForm(userid);
    }
}
