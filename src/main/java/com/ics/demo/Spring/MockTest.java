package com.ics.demo.Spring;

import com.ics.demo.MockFeignRestClient;
import com.ics.demo.Spring.models.MockStudent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MockTest implements CommandLineRunner {
    private final MockFeignRestClient feignRestClient;

    public MockTest(MockFeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }


    @Override
    public void run(String... args) throws Exception {


        MockStudent mockStudent= feignRestClient.createMockStudent(new MockStudent("94673","Cyril Owuor"));
        System.out.println("Registered Student"+mockStudent.toString());
    }
}
