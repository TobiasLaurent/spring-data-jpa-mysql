package com.laurent.spring.data.jpa.mysql.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// import com.laurent.spring.data.jpa.mysql.entity.Guardian;
import com.laurent.spring.data.jpa.mysql.entity.Student;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    // @Test
    // public void saveStudent() {
    //     Student student = Student.builder()
    //             .emailId("hi@tobias.com")
    //             .firstName("Tobias")
    //             .lastName("Vienen")
    //             .guardian(Guardian.builder()
    //                     .name("Nolan")
    //                     .email("nolan@tobias.de")
    //                     .mobile("123456")
    //                     .build())
    //             .build();

    //     studentRepository.save(student);
    // }

    @Test
    public void printAllStudent() {
        List<Student> studentList = studentRepository.findAll();

        log.info("studentList = " + studentList);
    }

    @Test
    public void printStudentByFirstName() {
        List<Student> studentList = studentRepository.findByFirstName("Tobias");

        studentList.forEach(student -> log.info("student = " + student));
    }

    @Test
    public void printStudentByFirstNameAndLastName() {
        List<Student> studentList = studentRepository.findByFirstNameAndLastName("Tobias", "Laurent");

        studentList.forEach(student -> log.info("student = " + student));
    }

    @Test
    public void printStudentByFirstNameContaining() {
        List<Student> studentList = studentRepository.findByFirstNameContaining("bi");

        studentList.forEach(student -> log.info("student = " + student));
    }

    @Test
    public void printStudentByLastNameNotNull() {
        List<Student> studentList = studentRepository.findByLastNameNotNull();

        studentList.forEach(student -> log.info("student = " + student));
    }

    @Test
    public void printStudentByGuardianName() {
        List<Student> studentList = studentRepository.findByGuardianName("Nolan");

        studentList.forEach(student -> log.info("student = " + student));
    }

    @Test
    public void printGetStudentFirstNameByEmailAddress() {
        String firstNameOfStudent = studentRepository.getStudentFirstNameByEmailAddress("hello@tobias.com");

        log.info("first name of student = " + firstNameOfStudent);
    }

    @Test
    public void printGetStudentByEmailAddress() {
        Student student = studentRepository.getStudentByEmailAddress("hello@tobias.com");

        log.info("student = " + student);
    }
}
