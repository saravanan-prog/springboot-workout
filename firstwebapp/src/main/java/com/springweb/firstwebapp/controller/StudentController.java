package com.springweb.firstwebapp.controller;

import com.springweb.firstwebapp.model.StudentDTO;
import com.springweb.firstwebapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

    @Autowired
    private StudentService studentservice;

    @GetMapping("showAllStudents")
    public List<StudentDTO> getAllStudent(){

        return this.studentservice.getAllStudentList();
    }

    @GetMapping("searchbyid/{id}")
    public StudentDTO studentsearchByID(
            @PathVariable long id
    ){
        return this.studentservice.getStudentlistSearchByID(id);
    }


}
