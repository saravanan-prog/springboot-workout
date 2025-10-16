package com.springweb.firstwebapp.controller;

import com.springweb.firstwebapp.Entities.TeacherEnitity;
import com.springweb.firstwebapp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;


    @GetMapping("allTeacherlist")
    public List<TeacherEnitity> getAllTeacherList(){
        return this.teacherService.getAllTeacherFromDBlist();
    }

    @PostMapping("addTeacher")
    public TeacherEnitity addnewTeacher(
            @RequestBody TeacherEnitity payload
    ){
        return this.teacherService.insertNewTeacher(payload);
    }

    @PutMapping("modifyTeacher/{id}")
    public TeacherEnitity modificationTeacher(
            @PathVariable long id,
            @RequestBody TeacherEnitity payload
    ){

        return this.teacherService.modificationTeacherData(id,payload);
    }

    @DeleteMapping("removeteacher/{id}")
    public  List<TeacherEnitity> removeTeacherList(
            @PathVariable long id
    ){
         return this.teacherService.removeTeacherFromDB(id);
    }
}
