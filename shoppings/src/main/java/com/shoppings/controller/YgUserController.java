package com.shoppings.controller;


import com.google.gson.Gson;
import com.shoppings.model.YgUser;
import com.shoppings.service.IYgUserService;
import com.shoppings.util.ReturnGson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/yus")
public class YgUserController {


    @Autowired
    private IYgUserService iyus;


    @RequestMapping("/detectionUser")
    public String detectionUser(HttpServletResponse resp,  String username, String useropenid){


        YgUser yu = new YgUser();
        System.out.println("----"+username);
        yu.setUsername(username);
        yu.setUseropenid(useropenid);


        Integer userId = iyus.detectionYgUser(yu);

        Gson gson = new Gson();
        String jsonUserId = gson.toJson(userId);
        ReturnGson.returnResult(jsonUserId , resp);

        return null;
    }

}
