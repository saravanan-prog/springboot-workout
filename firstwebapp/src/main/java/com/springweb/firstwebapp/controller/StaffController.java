package com.springweb.firstwebapp.controller;
import com.springweb.firstwebapp.model.StaffModel;
import com.springweb.firstwebapp.service.StaffService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/staff/")
public class StaffController {
    @Autowired
    private StaffService serviceobj;

    @GetMapping("getAllStaffList")

    public  ResponseEntity<List<StaffModel>> listallStaffs(
    ){

            System.out.println("True block");
            //return this.serviceobj.getStaffList();
            return new ResponseEntity<>(this.serviceobj.getStaffList(),HttpStatus.ACCEPTED);


    }

    @PostMapping("addStaff")
    public ResponseEntity<String>  addStaffList(
           @Valid @RequestBody StaffModel staffPayload
    ){
        //return this.serviceobj.addStaffList(staffPayload);
        return new ResponseEntity<>(this.serviceobj.addStaffList(staffPayload), HttpStatus.CREATED);
    }

    @PutMapping("modifyStaff/{id}")
    public List<StaffModel> modifyStaffDetails(
            @PathVariable long id,
            @RequestBody StaffModel updateStaffPayload
    ){
        return this.serviceobj.ModifyStaffDetailsStreamApi(id,updateStaffPayload);
    }


    @PatchMapping("staffNameFileldChange/{id}")
    public String modifyStaffFields(
            @PathVariable long id,
            @RequestBody StaffModel actualPayload
    ){

        return this.serviceobj.modifyField(id,actualPayload);
    }


    @DeleteMapping("/recordDelete/{id}")
    public List<StaffModel> removeStaffDetail(
            @PathVariable long id
    ){


        return this.serviceobj.removeStaff(id);
    }

}
