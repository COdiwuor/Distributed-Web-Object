package com.ics.demo;

import com.ics.demo.Spring.models.MockAppointment;
import com.ics.demo.Spring.models.MockLecturer;
import com.ics.demo.Spring.models.MockStudent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name ="student", url="http://10.55.11.230:1000")
public interface MockFeignRestClient {

    @RequestMapping(method = RequestMethod.POST, value = "students")
    MockStudent createMockStudent(@RequestBody MockStudent mockStudent);

    @RequestMapping(method = RequestMethod.GET, value = "students")
    MockStudent searchByName(@RequestParam(value = "studentNumber")String name);

    @RequestMapping(method = RequestMethod.GET,value = "lecturers")
    List<MockLecturer> viewLecturers();

    @RequestMapping(method = RequestMethod.POST, value = "appointments")
    MockAppointment createAppointment(@RequestBody MockAppointment mockAppointment);

    @RequestMapping(method = RequestMethod.PATCH, value = "appointment/{id}")
    MockAppointment confirmAppointment(@PathVariable(name = "id") Long id,@RequestParam(value = "StudentId")Long studentid);

}
