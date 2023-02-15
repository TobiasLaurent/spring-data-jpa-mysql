package com.laurent.spring.data.jpa.mysql.repository;

import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.laurent.spring.data.jpa.mysql.entity.Student;

import lombok.extern.log4j.Log4j2;



@SpringBootTest
@Log4j2
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("laurent@tobias.com")
                .firstName("Tobias")
                .lastName("Laurent")
                .guardianName("GuardianName")
                .guardianMobile("GuardianMobile")
                .guardianEmail("GuardianEmail")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList = studentRepository.findAll();
        
        log.info("studentList = " + studentList);
    }
}
