package com.ics.demo.Spring;

import com.ics.demo.MockFeignRestClient;
import com.ics.demo.Spring.models.MockStudent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {
    private final MockFeignRestClient feignRestClient;

    public Test(MockFeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }


    @Override
    public void run(String... args) throws Exception {


        MockStudent mockStudent= feignRestClient.createMockStudent(new MockStudent("94673","Cyril Owuor"));
        System.out.println("Registered Student"+mockStudent.toString());
    }
}
