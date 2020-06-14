package com.shoppings.dao;

import com.shoppings.model.YgUser;
import org.apache.ibatis.annotations.Param;

public interface IYgUserDao {

    //查询对应用户信息
    public Integer selectYgUser(@Param(value="openid")String openid);


    //添加用户信息
    public Integer insertYgUser(YgUser yu);

}
