package com.springweb.firstwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class WebAnnotionUrlFormat {


    @GetMapping
    public String getEndpointcheck(){

        return "Get Endpoint Reached Successfully";
    }

    @GetMapping("allProducts")
    public String getProdcts(){
        return "Your Product is Preparing";
    }

    @GetMapping("/products/{id:[0-9]+}")
    public String getById(@PathVariable int id) {
        return "Product ID: " + id;
    }

    @GetMapping("/products/{name:[a-zA-Z]+}")
    public String getByName(@PathVariable String name) {
        return "Product Name: " + name;
    }

    @GetMapping("products/{id}/{productname}")
    public String productSearchByIDandName(){

        return "Search By ID & product Name is Processing";
    }

}
