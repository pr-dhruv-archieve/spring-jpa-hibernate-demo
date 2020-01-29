package com.soma.app.repository;

import com.soma.app.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CourseRepository {

    @Autowired
    private EntityManager entityManager;

    public Course findById(Long id) {
        return entityManager.find(Course.class, id);
    }

    // publiuc Course save(Course course) -> insert or update

    // public void deleteById(Long id)

}
