package com.springweb.firstwebapp.repository;

import com.springweb.firstwebapp.Entities.TeacherEnitity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEnitity,Long> {
}
