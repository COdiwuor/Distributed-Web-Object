package com.ics.demo.Spring.services;

import com.ics.demo.NotFoundException;
import com.ics.demo.Spring.models.Student;
import com.ics.demo.Spring.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {

        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {

        return studentRepository.findById(id).orElseThrow(() ->
                new NotFoundException(("No student with id" + id + "found")));
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        Student stdnt = findById(student.getId());
        stdnt.setFirst_name(student.getFirst_name());
        stdnt.setLast_name(student.getLast_name());
        stdnt.setDob(student.getDob());
        return studentRepository.save(stdnt);
    }

    @Override
    public Student update(Long id, Student student) {
        Student newstudent = findById(id);
        newstudent.setFirst_name(student.getFirst_name());
        newstudent.setLast_name(student.getLast_name());
        newstudent.setDob(student.getDob());
        return studentRepository.save(newstudent);
    }

}
