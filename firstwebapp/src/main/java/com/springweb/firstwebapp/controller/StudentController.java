package com.springweb.firstwebapp.controller;

import com.springweb.firstwebapp.Entities.StudentEntity;
import com.springweb.firstwebapp.model.StudentDTO;
import com.springweb.firstwebapp.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

    @Autowired
    private StudentService studentservice;

    @GetMapping("showAllStudents")
    public List<StudentEntity> getAllStudent(){
       return this.studentservice.getAllStudentList();
    }

    @GetMapping("searchbyid/{id}")
    public ResponseEntity<StudentEntity>  studentsearchByID(
            @PathVariable long id
    ){

        return new ResponseEntity<>(this.studentservice.getStudentBasedonId(id), HttpStatus.ACCEPTED);
    }

    @PostMapping("/addStudent")
    public ResponseEntity<StudentEntity>  addNewStudent(
           @Valid @RequestBody StudentEntity studentPayload
    ){

        return new ResponseEntity<>(this.studentservice.addNewstudentInList(studentPayload), HttpStatus.CREATED);
    }





}
