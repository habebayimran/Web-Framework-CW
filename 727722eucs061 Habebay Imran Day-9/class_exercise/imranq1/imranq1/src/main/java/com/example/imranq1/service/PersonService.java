package com.example.imranq1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.imranq1.model.Person;
import com.example.imranq1.repository.PersonRepo;

@Service
public class PersonService {
    public PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(Person person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<Person> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
