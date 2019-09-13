package com.ics.demo.Spring.repositories;

import com.ics.demo.Spring.models.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University,Long> {

}
