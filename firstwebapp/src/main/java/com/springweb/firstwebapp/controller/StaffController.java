package com.springweb.firstwebapp.controller;

import com.springweb.firstwebapp.model.StaffModel;
import com.springweb.firstwebapp.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/staff/")
public class StaffController {
    @Autowired
    private StaffService serviceobj;

    @GetMapping("getAllStaffList")
    public List<StaffModel> listallStaffs(){
        return this.serviceobj.getStaffList();
    }

    @PostMapping("/addStaff")
    public String addStaffList(
            @RequestBody StaffModel staffPayload
    ){
        return this.serviceobj.addStaffList(staffPayload);
    }




}
