package com.axioma.courserservice.services;

import com.axioma.courserservice.entity.Course;
import com.axioma.courserservice.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CouserServiceImplement implements ICourseService{

    @Autowired
    private CourseRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {

        return (List<Course>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Course findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Course course) {
        repository.save(course);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);

    }
}
