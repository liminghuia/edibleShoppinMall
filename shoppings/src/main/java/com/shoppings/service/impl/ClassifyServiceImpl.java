package com.shoppings.service.impl;

import com.shoppings.dao.IClassifyDao;
import com.shoppings.model.Classify;
import com.shoppings.service.IClassifyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassifyServiceImpl implements IClassifyService {

    @Resource
    private IClassifyDao cify;


    public List<Classify> selectClassify(){
        return cify.selectClassify();
    }
}
