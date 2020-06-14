package com.shoppings.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import com.shoppings.service.IOrderFormService;
import com.shoppings.util.ReturnGson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ofc")
public class OrderFormController {

    @Autowired
    private IOrderFormService ofsi;

    /**
     * 生成订单
     * @param userid
     * @param classifysidString
     * @param resp
     * @return
     */
    @RequestMapping("/CreateOrderForm")
    public String CreateOrderForm(Integer userid, String classifysidString,HttpServletResponse resp){


        Integer saveInteger = ofsi.updateShoppingCarState(classifysidString, userid);

        Gson gson = new Gson();
        String jsonSaveInteger = gson.toJson(saveInteger);
        ReturnGson.returnResult(jsonSaveInteger,resp);


        return null;
    }


    /**
     *查看用户当前订单
     * @return
     */
    @RequestMapping("/selectNowOrderForm")
    public String  selectNowOrderForm(Integer userid , HttpServletResponse resp){
        List<Map<String, Object>> maps = ofsi.selectNowOrderForm(userid);

        Gson gson = new Gson();
        String gsonMaps = gson.toJson(maps);
        ReturnGson.returnResult(gsonMaps,resp);
        return null;
    }
}
