package com.ics.demo.Spring;

import com.ics.demo.Spring.models.Course;
import com.ics.demo.Spring.models.Student;
import com.ics.demo.Spring.models.University;
import com.ics.demo.Spring.repositories.CourseRepository;
import com.ics.demo.Spring.repositories.StudentRepository;
import com.ics.demo.Spring.repositories.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {

    private final UniversityRepository universityRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public DummyData(UniversityRepository universityRepository, StudentRepository studentRepository, CourseRepository courseRepository) {
        this.universityRepository = universityRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        University strath = new University("Strathmore", "Ole Sangale");
        universityRepository.save(strath);

        University Jkuat = new University("Jkuat","Juja");
        universityRepository.save(Jkuat);

        Student student = new Student("Cyril","Odiwuor",strath );
        studentRepository.save(student);

        Student student1=new Student("Trevor", "Mukwaya",Jkuat);
        studentRepository.save(student1);

        Course course =new Course("Application Programming for Internet");
        courseRepository.save(course);

        Course course1 = new Course("Distributed Web Object");
        courseRepository.save(course1);

        Student student2 = new Student ("John ","Doe", Jkuat);
        studentRepository.save(student2);

        course.addStudent(student2);
        courseRepository.save(course);

    }
}

//import com.ics.demo.Spring.models.Student;
//import com.ics.demo.Spring.repositories.StudentRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DummyData implements CommandLineRunner {
//    private final StudentRepository studentRepository;
//
//    public DummyData(StudentRepository studentRepository) {
//
//        this.studentRepository = studentRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Student first_year = new Student("Cyril","Odiwuor");
//        first_year.setMiddle_name("Owuor");
//        first_year.setDob("1997");
//        studentRepository.save(first_year);
//        Student second_year = new Student("John","Doe");
//        studentRepository.save(second_year);
//        Student third_year = new Student("Brenda","Cherono");
//        studentRepository.save(third_year);
//    }

