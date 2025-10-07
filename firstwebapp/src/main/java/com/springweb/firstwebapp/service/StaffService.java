package com.springweb.firstwebapp.service;

import com.springweb.firstwebapp.model.StaffModel;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {

    List<StaffModel> staff = new ArrayList<StaffModel>();

    public List<StaffModel> getStaffList(){
        return staff;
    }

    public String addStaffList(StaffModel staffPayload){
        staff.add(staffPayload);
        return "Staff detail added successfully";
    }
}
