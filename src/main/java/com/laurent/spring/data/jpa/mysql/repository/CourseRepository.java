package com.laurent.spring.data.jpa.mysql.repository;

import com.laurent.spring.data.jpa.mysql.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
