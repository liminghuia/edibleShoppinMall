package com.shoppings.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.shoppings.model.NavList;
import com.shoppings.service.INavListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/nav")
public class NavListController {

    @Autowired
    private INavListService inls;

    @RequestMapping("/navlist")
    public String selectNavList(int id, HttpServletResponse resp){
        System.out.println("///////////////////");
        List< NavList > selnav=inls.selectNavList(id);
        for (int i=0;i<selnav.size();i++) {
            NavList nav = selnav.get(i);
            System.out.println(nav.getId()+"  "+nav.getTitle()+"  "+nav.getSrc());
        }
        System.out.println(selnav.size());

        //将数据进行gson转换
        Gson gson = new Gson();
        String jsonSelNav = gson.toJson(selnav);
        System.out.println(jsonSelNav);
        try {
            //利用response请求将数据返回小程序
            PrintWriter out = resp.getWriter();
            out.write(jsonSelNav);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    @RequestMapping("/navInsert")
    public String navInsert(){
        System.out.println("///////////////////");
        NavList na = new NavList();
        na.setId(2);
        na.setSrc("/image/top1.png");
        na.setTitle("中间图");
        Integer integer = inls.navInsert(na);

        return null;
    }

}
