package com.shoppings.dao;

import com.shoppings.model.OrderForm;

import java.util.List;
import java.util.Map;

public interface IOrderFormDao {

      //添加订单
      public Integer saveOrderform(OrderForm of);


      //查看订单
      public List<Map<String,Object>> selectNowOrderForm(Integer userid);
}
