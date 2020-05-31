package com.shoppings.dao;

import com.shoppings.model.NavList;

import java.util.List;

public interface INavLiatDao {
    public List<NavList> selectNavList(int id);

    public Integer navInsert(NavList navl);
}
