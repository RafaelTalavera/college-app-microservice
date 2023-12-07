package com.axioma.usermicroservice.services;

import com.axioma.usermicroservice.models.entity.Student;

import com.axioma.usermicroservice.models.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class StudentServiceImplements implements StudentService{

    @Autowired
    private StudentRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Student> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Student> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);

    }
}
