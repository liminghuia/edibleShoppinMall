package com.shoppings.model;

import java.io.Serializable;

/**
 * 优秀商家表
 */
public class NiceSupplier implements Serializable {

    private Integer supplierid;

    private String suppliername;

    private Integer niceindent;

    private String supplierimagesrc;


    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public Integer getNiceindent() {
        return niceindent;
    }

    public void setNiceindent(Integer niceindent) {
        this.niceindent = niceindent;
    }

    public String getSupplierimagesrc() {
        return supplierimagesrc;
    }

    public void setSupplierimagesrc(String supplierimagesrc) {
        this.supplierimagesrc = supplierimagesrc;
    }
}
