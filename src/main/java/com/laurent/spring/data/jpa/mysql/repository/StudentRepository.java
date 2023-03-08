package com.laurent.spring.data.jpa.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

    @Query("select s.firstName from Student s where s.emailId = ?1")
    public String getStudentFirstNameByEmailAddress(String emailId);

    @Query(
     value = "SELECT * FROM tbl_student s where s.email_address = :emailId",
     nativeQuery = true   
    )
    public Student getStudentByEmailAddress(@Param("emailId") String emailId);

}
