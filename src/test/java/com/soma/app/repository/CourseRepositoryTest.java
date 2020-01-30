package com.soma.app.repository;

import com.soma.app.SpringJpaHibernateDemoApplication;
import com.soma.app.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= SpringJpaHibernateDemoApplication.class)
public class CourseRepositoryTest {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void contextLoad() {
        Course course = courseRepository.findById(10001L);
        assertEquals("Mahedra Prajapati", course.getName());
        log.info("Test is running.");
    }

}
