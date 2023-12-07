package com.axioma.usermicroservice.services;

import com.axioma.usermicroservice.models.entity.Student;

import java.util.Optional;

public interface StudentService {

    public Iterable<Student> findAll();

    public Optional<Student> findById(Long id);

    public Student save(Student student);

    public void deleteById(Long id);

}
