package com.shoppings.service;

import com.shoppings.model.Classify;

import java.util.List;

public interface IClassifyService {
    //查询商品分类列表
    public List<Classify>  selectClassify();
}
