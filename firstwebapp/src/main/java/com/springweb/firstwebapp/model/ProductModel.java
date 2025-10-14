package com.springweb.firstwebapp.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;


public class ProductModel {

    private int id;
    private String productName;
    private int productPrice;
    private int totalQty;

    public ProductModel(String productName, int productPrice, int totalQty) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.totalQty = totalQty;
    }

    public ProductModel() {
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }
}
