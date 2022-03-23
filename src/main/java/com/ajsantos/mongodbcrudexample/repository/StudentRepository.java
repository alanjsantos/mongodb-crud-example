package com.ajsantos.mongodbcrudexample.repository;

import com.ajsantos.mongodbcrudexample.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
