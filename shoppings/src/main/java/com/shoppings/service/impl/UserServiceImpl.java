package com.shoppings.service.impl;


import com.shoppings.service.IUserService;
import com.shoppings.dao.IUserDao;
import com.shoppings.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}