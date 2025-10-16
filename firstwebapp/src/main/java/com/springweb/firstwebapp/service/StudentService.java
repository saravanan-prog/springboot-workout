package com.springweb.firstwebapp.service;

import com.springweb.firstwebapp.Entities.StudentEntity;
import com.springweb.firstwebapp.exception.ResourceNotfoundException;
import com.springweb.firstwebapp.model.StudentDTO;
import com.springweb.firstwebapp.repository.StudentRepository;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentrepo;

    public List<StudentEntity> getAllStudentList(){
        return this.studentrepo.findAll();
    }
    public StudentEntity getStudentBasedonId(long id){

        return this.studentrepo.findById(id).orElseThrow(() -> new ResourceNotfoundException("Student ID is not found"));

    }

    public StudentEntity addNewstudentInList(StudentEntity studentPayload){
        return this.studentrepo.save(studentPayload);
    }



}
