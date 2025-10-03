package com.springweb.firstwebapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class BasicWebAnnotation {
    @GetMapping
    public String getEndpoint(){

        return "Get End point is triggred Saravanan";
    }

    @PostMapping
    public String PostData(){
        return "Post Endpoint is Triggred Saravanan";
    }

    @PutMapping
    public String putEndpoint(){
        return "Put Endpoint is Triggred Saravanan";
    }

    @DeleteMapping
    public String deleteEndpoint(){

        return "Delete Endpoint is triggred Saravanan";
    }

    @PatchMapping
    public String patchEndpoint(){

        return "Patch Mapping Endpoint Saravanan";
    }
}
