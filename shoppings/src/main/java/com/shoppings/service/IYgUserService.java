package com.shoppings.service;

import com.shoppings.model.YgUser;

public interface IYgUserService {


    /**
     * 查询用户是否登陆过，未登录保存信息
     * @param yg
     * @return
     */
   public Integer detectionYgUser(YgUser yg);


}
