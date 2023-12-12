package com.axioma.usermicroservice.controllers;

import com.axioma.usermicroservice.models.entity.Student;
import com.axioma.usermicroservice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentRestController {

    @Autowired
    private StudentService service;

    @GetMapping
    public ResponseEntity<?> list(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> show(@PathVariable Long id){
        Optional<Student> o = service.findById(id);
        if(o.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(o.get());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Student student){
        Student studentDb = service.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentDb);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> edit(@RequestBody Student student, @PathVariable Long id){
        Optional<Student> o = service.findById(id);

        if (o.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        Student studentDb = o.get();
        studentDb.setName(student.getName());
        studentDb.setLastname(student.getLastname());
        studentDb.setEmail(student.getEmail());
        studentDb.setCreateAt(student.getCreateAt());
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(studentDb));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
