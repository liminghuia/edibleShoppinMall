package com.shoppings.dao;


import com.shoppings.model.Classify;

import java.util.List;

public interface IClassifyDao {


    //查询商品分类列表
    public List<Classify>  selectClassify();

}
