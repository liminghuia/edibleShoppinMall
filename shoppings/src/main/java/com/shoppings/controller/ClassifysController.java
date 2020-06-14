package com.shoppings.controller;


import com.google.gson.Gson;
import com.shoppings.model.Classifys;
import com.shoppings.service.IClassifysService;
import com.shoppings.util.ReturnGson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@RequestMapping("/cifys")
@Controller
public class ClassifysController {


    @Autowired
    private IClassifysService icifys;


    /**
     * 查询全部分类
     * @param classify_id
     * @param resp
     * @return
     */

    @RequestMapping("/selectClassifys")
    public  String  selectClassifys(Integer classify_id,HttpServletResponse resp){
        List<Classifys> classifys = icifys.selectClassifys(classify_id);
        for(int i=0;i<classifys.size();i++){
            Classifys classifys1 = classifys.get(i);
            System.out.println(classifys1.getClassifys_id()+"  "+classifys1.getClassifys_name()+"   "+classifys1.getImagesrc()+"  "+classifys1.getPrice());
        }

        Gson gson = new Gson();
        String outclassifys = gson.toJson(classifys);

        ReturnGson.returnResult(outclassifys,resp);

        return null;
    }


    /**
     * 查询优秀供货商分类
     * @return
     */
    @RequestMapping("/niceSupplierClassifys")
    public String selectNicesupplier(Integer supplierid,HttpServletResponse resp){
        List<Classifys> classifys = icifys.selectSupplierClassifys(supplierid);

        //调用gson接口进行gson转换
        Gson gson = new Gson();
        String jsonclassifys = gson.toJson(classifys);
        ReturnGson.returnResult(jsonclassifys,resp);

        return null;
    }

    @RequestMapping("/selectOneClassifys")
    public  String  selectOneClassifys(Integer classifysid,HttpServletResponse resp){
        Classifys classifys = icifys.selectOneClassifys(classifysid);

        //调用gson接口进行gson转换
        Gson gson = new Gson();
        String jsonclassifys = gson.toJson(classifys);
        ReturnGson.returnResult(jsonclassifys,resp);
        return null;
    }
}
