package com.laurent.spring.data.jpa.mysql.repository;

import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.laurent.spring.data.jpa.mysql.entity.Course;
import com.laurent.spring.data.jpa.mysql.entity.CourseMaterial;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
@Transactional
public class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public void saveCourse() {
        Random rand = new Random();
        var randomNumber = rand.nextInt();
        Course course = Course.builder()
                .title("DSA" + randomNumber)
                .credit(6)
                .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .course(course)
                .url("ms@com" + randomNumber)
                .build();

        repository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterials() {
        List<CourseMaterial> courseMaterials = repository.findAll();
        log.info("courseMaterials = " + courseMaterials);
    }
}
