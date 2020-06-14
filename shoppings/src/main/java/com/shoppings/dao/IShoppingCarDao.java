package com.shoppings.dao;

import com.shoppings.model.Classifys;
import com.shoppings.model.ShoppingCar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IShoppingCarDao {

    //新增用户,且增加对应购物车
    public  Integer saveClassifysToShoppingCar(ShoppingCar scpojo);

    //查询用户购物车对应商品
    public List<Classifys>  selectShoppingCar(Integer userid);



    //添加或者减少购物车中商品
    public Integer addOrReduceShoppingCarClassifys(@Param(value="addreduce") Integer addreduce ,@Param(value="userid")Integer userid,@Param(value="classifysid")Integer classifysid);


    //删除购物车商品
    public Integer deleteShoppingCar(@Param(value = "userid") Integer userid,@Param(value = "classifysid") Integer classifysid);




    //查询数据库购物车是否存在当前商品
    public Integer selectOneShoppingCar(@Param(value = "userid") Integer userid , @Param(value = "classifysid") Integer classifysid);


    //修改添加数量
    public Integer updateShoppingCarQuantity(@Param(value = "userid") Integer userid , @Param(value = "classifysid") Integer classifysid);



    //根据商品id修改购物车商品状态
    public Integer updateShoppingCarState(ShoppingCar car);

}
