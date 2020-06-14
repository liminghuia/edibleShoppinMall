package com.shoppings.service;

import java.util.List;
import java.util.Map;

public interface IOrderFormService {

    //根据商品id修改购物车商品状态
    public Integer updateShoppingCarState( String classifysid, Integer userid);

    //查看当前用户订单信息
    public List<Map<String,Object>> selectNowOrderForm(Integer userid);
}
