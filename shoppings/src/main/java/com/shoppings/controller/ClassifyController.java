package com.shoppings.controller;


import com.google.gson.Gson;
import com.shoppings.model.Classify;
import com.shoppings.service.IClassifyService;
import com.shoppings.util.ReturnGson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


/**
 *分类控制类
 */
@Controller
@RequestMapping("/cify")
public class ClassifyController {


    @Autowired
    private IClassifyService ics;

    /**
     * 查询分类
     * @param resp
     * @return
     */
    @RequestMapping(value="/selectClassify",produces = {"application/text;charset=UTF-8"})
    public  String  selectClassify(HttpServletResponse resp){
        List<Classify> classifies = ics.selectClassify();
        for (int i = 0;i < classifies.size() ; i ++){
            Classify classify = classifies.get(i);
            System.out.println(classify.getClassify_id()+"   "+classify.getClass_name());
        }

        Gson gson = new Gson();
        String jonclassifies = gson.toJson(classifies);
        ReturnGson.returnResult(jonclassifies,resp);


        return null;
    }





}
