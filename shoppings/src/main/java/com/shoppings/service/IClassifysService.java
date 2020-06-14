package com.shoppings.service;

import com.shoppings.model.Classifys;

import java.util.List;

public interface IClassifysService  {

    //查询所有分类
    public List<Classifys>  selectClassifys(Integer classify_id);

    //查询优秀商家分类
    public List<Classifys> selectSupplierClassifys(Integer supplierid);

    //根据分类id查询分类详情
    public  Classifys  selectOneClassifys(Integer classifysid);
}
