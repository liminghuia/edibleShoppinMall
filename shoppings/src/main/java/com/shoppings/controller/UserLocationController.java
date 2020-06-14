package com.shoppings.controller;

import com.google.gson.Gson;
import com.shoppings.model.UserLocation;
import com.shoppings.service.IUserLocationService;
import com.shoppings.util.ReturnGson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.util.List;

@Controller
@RequestMapping("/ulc")
public class UserLocationController {

    @Autowired
    private IUserLocationService iuls;

    @RequestMapping("/ifUserLocationExist")
    public String saveUserLocation(UserLocation ul,String useropenid, HttpServletResponse resp){

        //某人错把UserLocation对象userid传为常量
        String res = iuls.ifUserLocationExist(ul,useropenid);

        Gson gson = new Gson();
        String jsonres = gson.toJson(res);
        ReturnGson.returnResult(jsonres,resp);


        return null;
    }


    //查看当前用户地址
    @RequestMapping("/selectUserLocation")
    public String selectUserLocation(Integer userid,HttpServletResponse resp){
        System.out.println("userid"+userid);
        List<UserLocation> userLocations = iuls.selectNowUserLocation(userid);
        System.out.println(userLocations);

        Gson gson = new Gson();
        String jsonUserLocations = gson.toJson(userLocations);
        ReturnGson.returnResult(jsonUserLocations,resp);


        return null;
    }

}
