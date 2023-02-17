package com.laurent.spring.data.jpa.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.laurent.spring.data.jpa.mysql.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
    public List<Student> findByFirstName(String firstName);

    public List<Student> findByFirstNameContaining(String firstName);

    public List<Student> findByLastNameNotNull();

    public List<Student> findByGuardianName(String name);

    public List<Student> findByFirstNameAndLastName(String firstName, String lastName);

    // TODO: 57:36 / 2:20:13

}
