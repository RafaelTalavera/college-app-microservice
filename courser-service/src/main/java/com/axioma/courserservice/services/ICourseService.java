package com.axioma.courserservice.services;

import com.axioma.courserservice.entity.Course;

import java.util.List;

public interface ICourseService {

    public List<Course> findAll();

    public Course findById(Long id);

    public void save(Course course);

    public void deleteById(Long id);


}
