package com.ics.demo.Spring.controller;


import com.ics.demo.Spring.models.Student;
import com.ics.demo.Spring.models.University;
import com.ics.demo.Spring.services.StudentService;
import com.ics.demo.Spring.services.UniversityService;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "universities",
produces = {
        MediaType.APPLICATION_XML_VALUE,
        MediaType.APPLICATION_JSON_VALUE
})

public class UniversityController  {
    private final UniversityService universityService;
    private final StudentService studentService;

    public UniversityController(UniversityService universityService, StudentService studentService) {
        this.universityService = universityService;
        this.studentService = studentService;
    }
    @GetMapping
    public List<University>findAll(){
        return universityService.findAll();
    }

    @GetMapping(value = "{id}")
    public University findById(@PathVariable(name = "id")Long id){
        return universityService.findById(id);
    }

    @PostMapping
    public University createUniversity(@Validated(University.Update.class)@RequestBody University university){
        return universityService.createUniversity(university);
    }

    @DeleteMapping(value = "{id}")
    public void deleteUniversity(@PathVariable Long id){
        universityService.delete(id);
    }

    @PatchMapping
    public University updateUniversity(@Validated(University.Update.class) @RequestBody University university){
        return universityService.update(university);
    }

    @PatchMapping(value = "{id}")
    public University updateUniversity(@PathVariable Long id, @RequestBody University university){
        return universityService.update(id, university);
    }

    @PostMapping(value = "{id}/students" )
    public Student createStudent(@PathVariable Long id,
                                 @RequestBody Student student){
        return universityService.createStudent(id,student);
    }
}




