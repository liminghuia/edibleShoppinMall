package com.shoppings.controller;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

/*
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.*;
*/

public class BasController {


    /**
     * ��ȡrequest
     * @return
     */
/*
    public  HttpServletRequest  getReq(){
        new HttpServletRequest();
        return H;
    }
*/


    /**
     * ��ȡresponse
     * @return
     */
   /*public HttpServletResponse getResp(){

       HttpServletResponse resp = ((ServletWebRequest)RequestContextHolder.getRequestAttributes()).getResponse();
        return resp;
    }*/

    /**
     * ��ȡsession
     * @return
     */
 /*   public HttpSession getSession(){
        HttpSession session = getReq().getSession();
        return session;
    }*/
}
