package com.shoppings.service.impl;

import com.shoppings.dao.IShoppingCarDao;
import com.shoppings.model.Classifys;
import com.shoppings.model.ShoppingCar;
import com.shoppings.service.IShoppingCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShoppingCarServiceImpl implements IShoppingCarService {


    @Resource
    private IShoppingCarDao isc;


    /**
     * 添加到购物车商品
     * @param scpojo
     * @return
     */
    @Override
    public Integer saveClassifysToShoppingCar(ShoppingCar scpojo) {

        return isc.saveClassifysToShoppingCar(scpojo);
    }

    /**
     * 查询购物车中对映商品
     * @param userid
     * @return
     */
    @Override
    public List<Classifys> selectShoppingCar(Integer userid ){

        return isc.selectShoppingCar(userid);
    }

    /**
     * 购物车增加或减少商品
     * @param addreduce
     * @return
     */
    @Override
    public Integer addOrReduceShoppingCar(Integer addreduce,Integer userid,Integer classifysid){

        String str=null;
        return isc.addOrReduceShoppingCarClassifys(addreduce,userid,classifysid);
    }


    /**
     * 删除购物车里商品
     * @param userid
     * @param classifysid
     * @return
     */
    @Override
    public Integer deleteShoppingCar(Integer userid, Integer classifysid) {
        return isc.deleteShoppingCar(userid,classifysid);
    }


    /**
     * 查询购物车单个商品
     * @param userid
     * @param classifysid
     * @return
     */
    @Override
    public Integer ifShoppingCarResSaveUpdate(Integer userid, Integer classifysid) {

        Integer existRes = isc.selectOneShoppingCar(userid, classifysid);
        //判断返回结果是否存在,存在修改数量,不存在添加商品
        Integer res = null;
        if(existRes == 1){

             res = isc.updateShoppingCarQuantity(userid, classifysid);

        }else{
            ShoppingCar sc = new ShoppingCar();
            sc.setUserid(userid);
            sc.setClassifysid(classifysid);
            sc.setQuantity(1);
            res =isc.saveClassifysToShoppingCar(sc);

        }

        return res;
    }


}
