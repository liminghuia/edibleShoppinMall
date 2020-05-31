package com.shoppings.service.impl;

import com.shoppings.dao.INavLiatDao;
import com.shoppings.model.NavList;
import com.shoppings.service.INavListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("navListService")
public class NavListServiceImpl implements INavListService {

    @Resource
    private INavLiatDao nld;
    public List< NavList > selectNavList (int id){

        return nld.selectNavList(id);
    }

    public Integer navInsert(NavList navl){

        return nld.navInsert(navl);
    }
}
