package com.shoppings.service;

import com.shoppings.model.User;
import org.springframework.stereotype.Repository;


public interface IUserService {

    public User selectUser(long userId);
}
