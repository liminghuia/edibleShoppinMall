package com.shoppings.model;

import java.io.Serializable;

public class UserLocation implements Serializable {

    private Integer userLocationId;

    private String shippingAddress;

    private Integer userId;

    private String shippingPerpson;

    private String shippingPhone;

    public Integer getUserLocationId() {
        return userLocationId;
    }

    public void setUserLocationId(Integer userLocationId) {
        this.userLocationId = userLocationId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Integer getUserId() {

        return userId;
    }

    public void setUserId(Integer userId) {

        this.userId = userId;
    }

    public String getShippingPerpson() {
        return shippingPerpson;
    }

    public void setShippingPerpson(String shippingPerpson) {
        this.shippingPerpson = shippingPerpson;
    }

    public String getShippingPhone() {
        return shippingPhone;
    }

    public void setShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone;
    }
}
