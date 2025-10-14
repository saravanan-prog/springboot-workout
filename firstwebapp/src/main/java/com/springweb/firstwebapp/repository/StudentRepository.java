package com.springweb.firstwebapp.repository;

import com.springweb.firstwebapp.model.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentDTO,Long> {
}
