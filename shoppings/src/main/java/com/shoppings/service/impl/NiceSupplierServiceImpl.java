package com.shoppings.service.impl;

import com.shoppings.dao.INiceSupplierDao;
import com.shoppings.model.NiceSupplier;
import com.shoppings.service.INiceSuppplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NiceSupplierServiceImpl implements INiceSuppplierService {

    @Resource
    private INiceSupplierDao ins;

    //查询优秀供应商
    public List<NiceSupplier>  selectNiceSupplier(){
     return  ins.selectNiceSupplier();
    }

}
