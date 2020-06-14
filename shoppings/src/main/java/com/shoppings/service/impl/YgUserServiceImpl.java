package com.shoppings.service.impl;

import com.google.gson.Gson;
import com.shoppings.dao.IShoppingCarDao;
import com.shoppings.dao.IYgUserDao;
import com.shoppings.model.YgUser;
import com.shoppings.service.IYgUserService;
import com.shoppings.util.ReturnGson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Service
public class YgUserServiceImpl implements IYgUserService {

    @Resource
    private IYgUserDao iyu;

    @Resource
    private IShoppingCarDao iscd;

    /**
     * 查询用户是否登陆过，未登录保存信息
     * @param yu
     * @return
     */
    @Override
    public Integer detectionYgUser(YgUser yu) {
        Integer userid = null;
        //查询用户对应id
        userid = iyu.selectYgUser(yu.getUseropenid());

        //判断用户是否存在,不存在先添加在查询
        if(userid == null || userid.equals("") || userid == 0){
            iyu.insertYgUser(yu);
           // saveShoppingCar = iscd.saveShoppingCar(yu.getUseropenid());
            userid = iyu.selectYgUser(yu.getUseropenid());
        }




        return userid;
    }


}
