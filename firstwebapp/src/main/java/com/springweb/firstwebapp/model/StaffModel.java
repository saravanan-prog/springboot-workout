package com.springweb.firstwebapp.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class StaffModel {


    private int staffId;

    @NotBlank(message = "Null Value not accepted")
    @Size(min=3, max=5, message="This is name filed is minimum 3 charater and maximum 5 character")
    private String staffName;



    private String staffQualifaction;
    private String staffDepartment;
    private String staffAddress;
    private int staffSalary;

    public StaffModel(int staffId, String staffName, String staffQualifaction, String staffDepartment, String staffAddress, int staffSalary) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffQualifaction = staffQualifaction;
        this.staffDepartment = staffDepartment;
        this.staffAddress = staffAddress;
        this.staffSalary = staffSalary;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffQualifaction() {
        return staffQualifaction;
    }

    public void setStaffQualifaction(String staffQualifaction) {
        this.staffQualifaction = staffQualifaction;
    }

    public String getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public int getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(int staffSalary) {
        this.staffSalary = staffSalary;
    }
}
