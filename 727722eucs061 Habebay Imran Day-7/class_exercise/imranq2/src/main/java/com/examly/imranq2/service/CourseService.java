package com.examly.imranq2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.imranq2.model.Course;
import com.examly.imranq2.repository.CourseRepo;

@Service
public class CourseService {

     @Autowired
     public CourseRepo courseRepo;

     public Course SaveEntity(Course entity) {
          return courseRepo.save(entity);

     }

     public List<Course> getDetails() {
          return courseRepo.findAll();

     }

     public List<Course> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
