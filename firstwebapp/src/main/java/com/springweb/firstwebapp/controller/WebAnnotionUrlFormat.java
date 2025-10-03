package com.springweb.firstwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class WebAnnotionUrlFormat {


    @GetMapping
    public String getEndpointcheck(){

        return "Get Endpoint Reached Successfully";
    }

    @GetMapping("products")
    public String getProdcts(){

        return "Your Product is Preparing";
    }

    @GetMapping("products/{id}")
    public int productSearchByID(){

        return 25000;
    }

    @GetMapping("products/{id}/{productname}")
    public String productSearchByIDandName(){

        return "Search By ID & product Name is Processing";
    }

}
