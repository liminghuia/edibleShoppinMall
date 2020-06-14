package com.shoppings.controller;

import com.google.gson.Gson;
import com.shoppings.model.Classifys;
import com.shoppings.model.ShoppingCar;
import com.shoppings.service.IShoppingCarService;
import com.shoppings.util.ReturnGson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/sc")
public class ShoppingCarController {

    @Autowired
    private IShoppingCarService iscs;

    //向购物车添加商品
    @RequestMapping("/sctsc")
    public String saveClassifysToShoppingCar(ShoppingCar sc, HttpServletResponse resp){
System.out.println(sc.getUserid()+"  "+sc.getQuantity()+"  "+sc.getClassifysid());


        //调用服务层存储商品
        Integer saveCount = iscs.saveClassifysToShoppingCar(sc);

        Gson gson = new Gson();
        String jsonSaveCount = gson.toJson(saveCount);
        ReturnGson.returnResult(jsonSaveCount,resp);


        return null;
    }

    //查询购物车商品
    @RequestMapping("/selectShoppingCar")
    public String selectShoppingCar(Integer userid,HttpServletResponse resp){
        System.out.println("查询购物车商品:"+userid);
        List<Classifys> listClassifys = iscs.selectShoppingCar(userid);

        Gson gson = new Gson();
        String jsonListClassifys = gson.toJson(listClassifys);
        ReturnGson.returnResult(jsonListClassifys,resp);

        return null;
    }


    //购物车中增加商品或减少商品
    @RequestMapping("/addOrReduceShoppingCar")
    public String addOrReduceShoppingCar(Integer addreduce, Integer userid,Integer classifysid,HttpServletResponse resp){
        System.out.println("购物车添加商品addreduce:"+addreduce+"userid:"+userid);
        Integer res = iscs.addOrReduceShoppingCar(addreduce, userid, classifysid);

        Gson gson = new Gson();
        String jsonListres = gson.toJson(res);
        ReturnGson.returnResult(jsonListres,resp);


        return null;
    }


    //删除购物车商品
    @RequestMapping("/deleteShoppingCar")
    public String deleteShoppingCar(Integer userid,Integer classifysid,HttpServletResponse resp){
     System.out.println("删除购物车商品:"+userid+" "+classifysid);
        Integer deletesc = iscs.deleteShoppingCar(userid, classifysid);

        Gson gson = new Gson();
        String jsondeletesc = gson.toJson(deletesc);
        ReturnGson.returnResult(jsondeletesc,resp);


        return null;
    }

    //首页购物车增加商品
    @RequestMapping("/shoppingCarHomePageJudge")
    public String shoppingCarHomePageJudge(Integer userid , Integer classifysid,HttpServletResponse resp){
        Integer res = iscs.ifShoppingCarResSaveUpdate(userid, classifysid);
        System.out.println("结果："+res);

        Gson gson = new Gson();
        String jsonres = gson.toJson(res);
        ReturnGson.returnResult(jsonres,resp);
        return null;

    }


}
