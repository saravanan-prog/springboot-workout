package com.springweb.firstwebapp.service;

import com.springweb.firstwebapp.Entities.TeacherEnitity;
import com.springweb.firstwebapp.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<TeacherEnitity> getAllTeacherFromDBlist(){
        return this.teacherRepository.findAll();
    }
    public TeacherEnitity insertNewTeacher(TeacherEnitity payload){
        return this.teacherRepository.save(payload);
    }

    public TeacherEnitity findTeacherByID(long id){

        return this.teacherRepository.findById(id).orElseThrow(() -> new RuntimeException("Teacher Id is not found"));
    }

    public TeacherEnitity modificationTeacherData(long id, TeacherEnitity payload){

        TeacherEnitity teacherRecord = this.findTeacherByID(id);

        if(teacherRecord !=null){
            teacherRecord.setFirstName(payload.getFirstName());
            teacherRecord.setLastName(payload.getLastName());
            teacherRecord.setQualification(payload.getQualification());
            teacherRecord.setSalary(payload.getSalary());


        }

       return teacherRepository.save(teacherRecord);


    }


    public List<TeacherEnitity> removeTeacherFromDB(long id){

         if(teacherRepository.existsById(id)){
             this.teacherRepository.deleteById(id);
         }

        return this.teacherRepository.findAll();

    }
}
