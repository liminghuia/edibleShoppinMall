package com.shoppings.service;

import com.shoppings.model.NavList;

import java.util.List;


public interface INavListService {

    public List<NavList> selectNavList(int id);

    public Integer navInsert(NavList nal);
}
