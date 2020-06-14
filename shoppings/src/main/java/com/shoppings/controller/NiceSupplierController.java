package com.shoppings.controller;

import com.google.gson.Gson;
import com.shoppings.model.NiceSupplier;
import com.shoppings.service.INiceSuppplierService;
import com.shoppings.util.ReturnGson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/nsc")
public class NiceSupplierController {

    @Autowired
    private INiceSuppplierService inser;


    @RequestMapping("/selectNicesupplier")
    public String  selectNicesupplier(HttpServletResponse resp){
        List<NiceSupplier> niceSuppliers = inser.selectNiceSupplier();

        Gson gson = new Gson();
        String jsonNiceSuppliers = gson.toJson(niceSuppliers);
        ReturnGson.returnResult(jsonNiceSuppliers,resp);


        return null;
    }

}
