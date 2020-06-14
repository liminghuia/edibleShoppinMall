package com.shoppings.service.impl;

import com.shoppings.dao.IClassifysDao;
import com.shoppings.model.Classifys;
import com.shoppings.service.IClassifysService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassifysServiceImpl implements IClassifysService {

    @Resource
    private IClassifysDao icifys;

    //查询所有分类服务层
    public List<Classifys> selectClassifys(Integer classify_id){
        return icifys.selectClassifys(classify_id);
    }


    //查询优秀商家服务层
    public List<Classifys> selectSupplierClassifys(Integer supplierid){

        return icifys.selectSupplierClassifys(supplierid);
    }

    //根据分类id查询分类详情
    public  Classifys  selectOneClassifys(Integer classifysid){
        return icifys.selectOneClassifys(classifysid);
    }
}
