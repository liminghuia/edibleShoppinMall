package com.shoppings.dao;

import com.shoppings.model.NiceSupplier;

import java.util.List;

public interface INiceSupplierDao {
    /**
     * 查询优秀商家
      */
    public List<NiceSupplier>  selectNiceSupplier();
}
