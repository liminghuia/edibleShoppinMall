package com.shoppings.service;

import com.shoppings.model.Classifys;
import com.shoppings.model.ShoppingCar;

import java.util.List;

public interface IShoppingCarService {


    //存储商品到购物车
    public  Integer   saveClassifysToShoppingCar(ShoppingCar scpojo);

    //查询购物车用户对映所有商品
    public List<Classifys>  selectShoppingCar(Integer userid);

    //购物车增加或减少商品
    public Integer addOrReduceShoppingCar(Integer addreduce,Integer userid,Integer classifysid);

    //购物车删除商品
    public Integer deleteShoppingCar(Integer userid,Integer classifysid);

    //查询购物车单个商品
    public Integer ifShoppingCarResSaveUpdate(Integer userid , Integer classifysid);


}
