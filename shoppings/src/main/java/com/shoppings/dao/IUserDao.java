package com.shoppings.dao;

import com.shoppings.model.User;

public interface IUserDao {

    User selectUser(long id);
}