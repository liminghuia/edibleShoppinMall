package com.shoppings.controller;


import com.shoppings.model.User;
import com.shoppings.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequestEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping("/tree")
public class UserController {

    @Autowired
    private IUserService userService;



    @RequestMapping("/select")
    public ModelAndView selectUser(HttpServletRequest req,HttpServletResponse resp) throws Exception {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
        ModelAndView mv = new ModelAndView("Redirect:jsp/user");
        User user = userService.selectUser(1);
        mv.addObject("user", user);
        mv.setViewName("user");
        System.out.print(user.getId()+"   "+user.getUsername()+"  "+user.getMobile()+"  "+user.getEmail());

        //HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        //HttpServletResponse resp = ((ServletWebRequest)RequestContextHolder.getRequestAttributes()).getResponse();

        //resp.sendRedirect("/user.jsp");
        return null;
    }

    @RequestMapping("/tiaozhuan")
    public String tiao(HttpServletRequest req,HttpServletResponse resp){
        ModelAndView modelAndView = new ModelAndView("text");

        return "text";

    }

    @RequestMapping("/httpTiao")
    public void httpTiao(HttpServletRequest req,HttpServletResponse resp) throws IOException {


        resp.setContentType("text/html;charset=UTF-8");
        resp.sendRedirect(req.getContextPath()+"/demo.jsp");

        resp.getWriter().print("");
    }


    @RequestMapping("/chongDing")
    public void chongDing(HttpServletRequest req,HttpServletResponse resp) throws IOException {


        resp.setContentType("text/html;charset=UTF-8");
        resp.sendRedirect(req.getContextPath()+"/demo.jsp");

    }
}