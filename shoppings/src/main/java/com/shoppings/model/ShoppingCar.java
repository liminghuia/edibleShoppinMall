package com.shoppings.model;

//购物车
public class ShoppingCar {

    //购物车id
    private Integer  shoppingid;

    //用户关联id
    private Integer  userid;

    //商品分类id
    private Integer classifysid;

    //商品总数
    private Integer quantity;

    //订单表关联id
    private String ordernumber;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getShoppingid() {
        return shoppingid;
    }

    public void setShoppingid(Integer shoppingid) {
        this.shoppingid = shoppingid;
    }

    public Integer getClassifysid() {
        return classifysid;
    }

    public void setClassifysid(Integer classifysid) {
        this.classifysid = classifysid;
    }
}
