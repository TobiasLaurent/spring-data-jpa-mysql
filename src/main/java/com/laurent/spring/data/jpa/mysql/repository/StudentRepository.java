package com.laurent.spring.data.jpa.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurent.spring.data.jpa.mysql.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    // create test class
}
