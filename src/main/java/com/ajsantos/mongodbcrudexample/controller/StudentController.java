package com.ajsantos.mongodbcrudexample.controller;

import com.ajsantos.mongodbcrudexample.model.Student;
import com.ajsantos.mongodbcrudexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("student")
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public ResponseEntity<Student> save (@RequestBody Student student) {
        student = service.save(student);

        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAll () {
        List<Student> student  = service.findAll();

        return ResponseEntity.ok().body(student);
    }
    @GetMapping("{id}")
    public ResponseEntity<Student> findById(@PathVariable String id) {
        Student student = service.findById(id);

        return ResponseEntity.ok().body(student);
    }

    @PutMapping("{id}")
    public ResponseEntity<Student> update (@RequestBody Student student, @PathVariable String id) {
        student.setId(id);
        student = service.save(student);

        return ResponseEntity.ok().body(student);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete (@PathVariable String id) {
        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}
