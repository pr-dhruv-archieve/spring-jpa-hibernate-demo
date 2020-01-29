package com.soma.app;

import com.soma.app.entity.Course;
import com.soma.app.repository.CourseRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaHibernateDemoApplication implements CommandLineRunner {

	private Logger logger = LogManager.getLogger(this.getClass());

	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = courseRepository.findById(10001L);
		System.out.println("Course Logged : " + course);
	}
}
