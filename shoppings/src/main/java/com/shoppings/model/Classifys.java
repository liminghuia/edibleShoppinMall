package com.shoppings.model;

public class Classifys {
    private int classifys_id;

    private String classifys_name;

    private Double price;

    private String imagesrc;

    //分类主表id
    private int classify_id;

    //购物车
    private  int  shoppingcar_id;

    //商家标识
    private Integer supplierid;

    private String classifysdetail;

    private String classifysparameter;


    public String getClassifysdetail() {
        return classifysdetail;
    }

    public void setClassifysdetail(String classifysdetail) {
        this.classifysdetail = classifysdetail;
    }

    public String getClassifysparameter() {
        return classifysparameter;
    }

    public void setClassifysparameter(String classifysparameter) {
        this.classifysparameter = classifysparameter;
    }

    //购物车表数量
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public int getClassifys_id() {
        return classifys_id;
    }

    public void setClassifys_id(int classifys_id) {
        this.classifys_id = classifys_id;
    }

    public String getClassifys_name() {
        return classifys_name;
    }

    public void setClassifys_name(String classifys_name) {
        this.classifys_name = classifys_name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImagesrc() {
        return imagesrc;
    }

    public void setImagesrc(String imagesrc) {
        this.imagesrc = imagesrc;
    }

    public int getClassify_id() {
        return classify_id;
    }

    public void setClassify_id(int classify_id) {
        this.classify_id = classify_id;
    }

    public int getShoppingcar_id() {
        return shoppingcar_id;
    }

    public void setShoppingcar_id(int shoppingcar_id) {
        this.shoppingcar_id = shoppingcar_id;
    }
}
