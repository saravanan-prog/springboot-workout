package com.springweb.firstwebapp.service;

import com.springweb.firstwebapp.model.ProductModel;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public String checkPostmethodResponse(){
        return "Post Method is Working Perfect";
    }

    public String addProductResponse(ProductModel product){
        String productname = product.getProductName();
        return "Your " + productname + " product Added Succesfully";
    }
}
