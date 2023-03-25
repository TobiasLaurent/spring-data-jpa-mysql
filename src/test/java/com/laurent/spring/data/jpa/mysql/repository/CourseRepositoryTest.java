package com.laurent.spring.data.jpa.mysql.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.laurent.spring.data.jpa.mysql.entity.Course;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void saveCourse() {
        Course course = Course.builder()
                .build();

        courseRepository.save(course);
    }

    @Test
    public void printCourse() {
        List<Course> courses = courseRepository.findAll();

        log.info("courses = " + courses);
    }
}
