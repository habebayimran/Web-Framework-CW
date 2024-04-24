package com.examly.imranq1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.imranq1.model.Person;

/**
 * PersonRepo
 */
@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

     List<Person> findByAge(int byAge);
}