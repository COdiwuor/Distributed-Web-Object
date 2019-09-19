package com.ics.demo.Spring.services;

import com.ics.demo.Spring.models.Student;
import com.ics.demo.Spring.models.University;

import java.util.List;

public interface UniversityService  {
    List<University> findAll();
    University findById(Long id);
    void delete(Long id);

    University createUniversity(University university);
    University update(University university);
    University update(Long id, University university); //overloading in OOP
    Student createStudent(Long id, Student student);
}
