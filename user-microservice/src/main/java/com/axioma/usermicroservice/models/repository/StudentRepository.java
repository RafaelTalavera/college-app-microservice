package com.axioma.usermicroservice.models.repository;

import com.axioma.usermicroservice.models.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
