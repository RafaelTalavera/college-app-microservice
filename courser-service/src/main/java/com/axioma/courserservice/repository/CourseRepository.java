package com.axioma.courserservice.repository;

import com.axioma.courserservice.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
