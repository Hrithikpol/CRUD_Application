package com.student.Student_CRUD.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.student.Student_CRUD.entity.*;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}