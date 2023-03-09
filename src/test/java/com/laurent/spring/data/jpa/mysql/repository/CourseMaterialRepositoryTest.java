package com.laurent.spring.data.jpa.mysql.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.laurent.spring.data.jpa.mysql.entity.Course;
import com.laurent.spring.data.jpa.mysql.entity.CourseMaterial;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public void saveCourse() {
        Course course = Course.builder()
                .title("DSA")
                .credit(6)
                .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .course(course)
                .url("ms@com")
                .build();

        repository.save(courseMaterial);
    }
}
