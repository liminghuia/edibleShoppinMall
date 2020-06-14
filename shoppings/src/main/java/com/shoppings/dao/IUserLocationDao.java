package com.shoppings.dao;

import com.shoppings.model.UserLocation;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IUserLocationDao {
    //增加收货地址
    public Integer saveUserLocation(UserLocation ul);

    //查询用户地址是否存在
    public Integer  selectUserLocation(@Param(value="useropenid") String useropenid);

    //修改用户地址
    public Integer updateUserLocation(@Param(value="map") Map<String , Object> map);


    //查询当前用户地址
    public List<UserLocation>  selectNowUserLocation(Integer userid);
}
