package com.example.imranq2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.imranq2.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}