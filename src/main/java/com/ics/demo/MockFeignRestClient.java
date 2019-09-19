package com.ics.demo;

import com.ics.demo.Spring.models.MockStudent;
import com.ics.demo.Spring.models.University;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name ="student", url="http://10.51.11.230:1000")
public interface MockFeignRestClient {


    @RequestMapping(method = RequestMethod.POST, value = "students")
    MockStudent createMockStudent(@RequestBody MockStudent mockStudent);

}
