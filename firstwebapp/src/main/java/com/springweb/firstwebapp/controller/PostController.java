package com.springweb.firstwebapp.controller;

import com.springweb.firstwebapp.model.ProductModel;
import com.springweb.firstwebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class PostController {

    @Autowired
    private ProductService psobj;




    @PostMapping("connectionChecking")
    public String checkingPostMethod(){
        return this.psobj.checkPostmethodResponse();
    }

    @PostMapping("addProduct")
    public String addProduct(
            @RequestBody ProductModel product
    ){
        return this.psobj.addProductResponse(product);
    }




}
