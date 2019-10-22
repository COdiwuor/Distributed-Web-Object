package com.ics.demo.Spring.repositories;

import com.ics.demo.Spring.models.University;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.Location;
import java.util.List;

public interface UniversityRepository extends JpaRepository<University,Long> {
    List<University>findByName(String name);

    List<University>findByNameContaining(String name);

    List<University>findByYearFoundedGreaterThan(String yearFounded);



}
