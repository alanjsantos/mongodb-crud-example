package com.ajsantos.mongodbcrudexample.service;

import com.ajsantos.mongodbcrudexample.model.Student;
import com.ajsantos.mongodbcrudexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student save (Student student) {
        return repository.save(student);
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student findById (String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Object not found"));

    }

    public Student update (Student student) {
        student.setId(student.getId());
        student = repository.save(student);
        return repository.save(student);
    }

    public void delete (String id) {
        repository.deleteById(id);
    }
}
