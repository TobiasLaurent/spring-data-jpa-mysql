package com.laurent.spring.data.jpa.mysql.repository;

import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.laurent.spring.data.jpa.mysql.entity.Course;
import com.laurent.spring.data.jpa.mysql.entity.Teacher;

@SpringBootTest
public class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher() {
        Random rand = new Random();
        var randomNumber = rand.nextInt();
        Course course1 = Course.builder()
                .title("Math" + randomNumber)
                .credit(5)
                .build();
        Course course2 = Course.builder()
                .title("Java")
                .credit(10)
                .build();
        Teacher teacher = Teacher.builder()
                .firstName("Peter" + randomNumber)
                .lastName("Schmidt")
                .courses(List.of(course1, course2))
                .build();
        teacherRepository.save(teacher);
    }
}
