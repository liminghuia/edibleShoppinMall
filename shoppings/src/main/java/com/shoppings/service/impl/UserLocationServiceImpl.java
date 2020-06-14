package com.shoppings.service.impl;

import com.shoppings.dao.IUserLocationDao;
import com.shoppings.model.UserLocation;
import com.shoppings.service.IUserLocationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class UserLocationServiceImpl implements IUserLocationService {

    @Resource
    private IUserLocationDao iuld;

    @Override
    public String ifUserLocationExist(UserLocation ul,String useropenid) {
        System.out.println("地址传值："+ul.getShippingPerpson()+"   "+ul.getShippingAddress()+"  "+ul.getShippingPhone());
        String res="失败";
        if(useropenid != null && !useropenid.equals("")){
            Integer count = iuld.selectUserLocation(useropenid);

            if(count>0){
                Map<String,Object> map=new HashMap<>();
                map.put("useropenid",useropenid);
                map.put("ul",ul);
                iuld.updateUserLocation(map);

                res = "修改成功";
            }else{

                iuld.saveUserLocation(ul);

                res = "插入成功";
            }
        }
        return res;
    }


    //查看当前用户地址
    public List<UserLocation> selectNowUserLocation(Integer userid){
           System.out.println("服务层："+userid);
        List<UserLocation> aa = iuld.selectNowUserLocation(userid);
        System.out.println("服务层返回："+aa);
        return aa;
    }

}
