package com.springweb.firstwebapp.service;

import com.springweb.firstwebapp.model.StaffModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class StaffService {

    List<StaffModel> staff = new ArrayList<>();

    public StaffService(){
                    staff = Arrays.asList(
                            new StaffModel(1L,"Raja","MCA","IT","chennai",100000),
                            new StaffModel(2L,"kamal","B.tech","IT","Bangalore",10000),
                            new StaffModel(3L,"Rishab","B.tech","IT","Mumbai",250000)
                    );
    }

    public List<StaffModel> getStaffList(){
        System.out.println("Service method is invoked");
        return staff;

    }

    public String addStaffList(StaffModel staffPayload){

        System.out.println(staffPayload.getStaffName());
        staff.add(staffPayload);
        return "Staff detail added successfully";
    }

    public String modifyStaffDetails(long id,StaffModel actualPayload){

        for(StaffModel item : staff){
            if(item.getStaffId() == id){
                item.setStaffId(actualPayload.getStaffId());
                item.setStaffName(actualPayload.getStaffName());
                item.setStaffQualifaction(actualPayload.getStaffQualifaction());
                item.setStaffDepartment(actualPayload.getStaffDepartment());
                item.setStaffAddress(actualPayload.getStaffAddress());
                item.setStaffSalary(actualPayload.getStaffSalary());

                return "Record Modified Successfully";
            }
        }



        return "ID is Not found";
    }
    public List<StaffModel> ModifyStaffDetailsStreamApi(long id,StaffModel actualPayload){
        List<StaffModel> updatedStaff = staff.stream()
                .filter(item -> item.getStaffId() == id)
                .peek(
                        item -> {
                            item.setStaffId(actualPayload.getStaffId());
                            item.setStaffName(actualPayload.getStaffName());
                            item.setStaffQualifaction(actualPayload.getStaffQualifaction());
                            item.setStaffDepartment(actualPayload.getStaffDepartment());
                            item.setStaffAddress(actualPayload.getStaffAddress());
                            item.setStaffSalary(actualPayload.getStaffSalary());
                        }
                )
                .collect(Collectors.toList());


        return updatedStaff;
    }

    public String modifyField(long id,StaffModel actualPayload){
        for(StaffModel data : staff){
            if(data.getStaffId() == id ){
                data.setStaffName(actualPayload.getStaffName());
                return "Record Modified Success";
            }
        }
        return "ID Not found";
    }

    public List<StaffModel> removeStaff(long id){

        List<StaffModel> newStaff =  staff.stream()
                .filter(item->item.getStaffId() != id)
                .collect(Collectors.toList());

        staff = newStaff;

        return staff;
    }




}
