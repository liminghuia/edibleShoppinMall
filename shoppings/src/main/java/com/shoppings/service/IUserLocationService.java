package com.shoppings.service;

import com.shoppings.model.UserLocation;

import java.util.List;

public interface IUserLocationService {

    //查询用户地址是否存在,不存在添加存在修改
    public String ifUserLocationExist(UserLocation ul,String useropenid);


    //查看当前用户地址
    public List<UserLocation> selectNowUserLocation(Integer userid);
}
