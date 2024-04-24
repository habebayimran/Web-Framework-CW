package com.example.imranq2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.imranq2.model.Student;
import com.example.imranq2.repository.StudentRepo;

@Service
public class StudentService {

     @Autowired
     public StudentRepo studentRepo;

     public List<Student> getAll() {
          return studentRepo.findAll();
     }

     public Student post(Student student) {
          return studentRepo.save(student);
     }

     public List<Student> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
