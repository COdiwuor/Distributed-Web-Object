package com.ics.demo;

import com.ics.demo.Spring.models.MockAppointment;
import com.ics.demo.Spring.models.MockLecturer;
import com.ics.demo.Spring.models.MockMatches;
import com.ics.demo.Spring.models.MockStudent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name ="student", url="http://10.51.10.111:2200",configuration = FeignConfig.class )
public interface MockFeignRestClient {

    /*
    *Mock cat
     */

    //Register a student
    @RequestMapping(method = RequestMethod.POST, value = "students")
    MockStudent createMockStudent(@RequestBody MockStudent mockStudent);

    //Return a student
    @RequestMapping(method = RequestMethod.GET, value = "students")
    MockStudent searchByName(@RequestParam(value = "studentNumber")String name);

    //view lecturers
    @RequestMapping(method = RequestMethod.GET,value = "lecturers")
    List<MockLecturer> viewLecturers();

    //Create appointments
    @RequestMapping(method = RequestMethod.POST, value = "appointments")
    MockAppointment createAppointment(@RequestBody MockAppointment mockAppointment);

    //Confirm appointment
    @RequestMapping(method = RequestMethod.PATCH, value = "appointments/{id}")
    MockAppointment confirmAppointment(@PathVariable(name = "id") Long id,@RequestParam(value = "studentId")Long studentId);

    /*
    *Cat1
     */
    @RequestMapping(method = RequestMethod.POST, value ="matches")
    MockMatches Requestmatches(@RequestBody MockMatches mockMatches);

    @RequestMapping(method = RequestMethod.GET, value = "matches")
    MockMatches searchByGender(@RequestParam(value = "gender")String name);

    @RequestMapping(method = RequestMethod.PATCH, value = "matches")
    MockMatches RejectMatch(@PathVariable(value = "Blind Date/{id}") Long id );




}
