package com.laurent.spring.data.jpa.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurent.spring.data.jpa.mysql.entity.CourseMaterial;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long>{
    
}
