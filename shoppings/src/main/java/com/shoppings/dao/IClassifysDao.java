package com.shoppings.dao;

import com.shoppings.model.Classifys;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IClassifysDao {

    //根绝分类主表id查询分类明细
    public List<Classifys>  selectClassifys(@Param(value = "classify_id") Integer classify_id);


    //查询优秀供货商分类
    public List<Classifys>  selectSupplierClassifys(Integer supplierid);

    //根据分类id查询分类详情
    public  Classifys  selectOneClassifys(Integer classifysid);


}
