package com.ics.demo;


import com.ics.demo.Spring.models.University;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "client", url = "http://10.51.10.111:9090", configuration = FeignConfig.class)
public interface FeignRestClient {
    /*
    University and Student mapping
     */
    @RequestMapping(method = RequestMethod.GET, value = "universities")
    List<University>getAllUniversities();

    @RequestMapping(method = RequestMethod.GET, value = "universities/{id}")
    University findById(@PathVariable(name = "id")Long id);

    @RequestMapping(method = RequestMethod.POST, value = "universities")
    University createUniversity(@RequestBody University university);

    @RequestMapping(method = RequestMethod.PATCH,value = "universities/{id}")
    University update(@PathVariable("id") Long id,@RequestBody University university);

    @RequestMapping(method = RequestMethod.GET, value = "universities/search")
    List<University>searchByName(@RequestParam(value = "name") String name);


//    @RequestMapping(method = RequestMethod.POST, value = "companies/{companyId}/attachments")
//    Attachment RequestAttachment(@PathVariable("companyId") Long id, @RequestParam(name = "studentId") Long studentId);

//    @RequestMapping(method = RequestMethod.PATCH,value = "companies/{companyId}/attachments")
//    Department RequestDepartment(@PathVariable("companyId") Long companyId,@RequestParam(name = "studentId") Long studentId,@RequestParam(name = "departmentId") Long departmentId);

//    @RequestMapping(method = RequestMethod.DELETE, value = "departments")
//    Department RejectDepartment(@RequestBody Department department);

}
