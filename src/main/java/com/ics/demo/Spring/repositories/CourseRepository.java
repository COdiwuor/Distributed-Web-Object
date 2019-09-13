package com.ics.demo.Spring.repositories;

import com.ics.demo.Spring.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
