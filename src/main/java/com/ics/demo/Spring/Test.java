package com.ics.demo.Spring;

import com.ics.demo.FeignRestClient;
import com.ics.demo.MockFeignRestClient;
import com.ics.demo.Spring.models.MockAppointment;
import com.ics.demo.Spring.models.MockLecturer;
import com.ics.demo.Spring.models.MockStudent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Component
public class Test implements CommandLineRunner {
    private final FeignRestClient feignRestClient;
    private final MockFeignRestClient mockfeignRestClient ;// Declare a feign client


    public Test(FeignRestClient feignRestClient, MockFeignRestClient mockfeignRestClient) {
        this.feignRestClient = feignRestClient;
        this.mockfeignRestClient = mockfeignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();


//        ResponseEntity<List<University>>response= restTemplate.exchange(
//                "http://10.51.10.111:9090/universities",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<University>>() {
//
//                }
//
//
//        );
//
//        List<University> universities = response.getBody();
//        System.out.println(universities);
//
//        universities=feignRestClient.getAllUniversities();
//        System.out.println("Feign Universities:"+universities.toString());
//
//
//        University university = restTemplate.getForObject(
//                "http://10.51.10.111:9090/universities/5",
//                University.class
//
//        );
//
//        String url= "http://10.51.10.111:9090/universities/search?name="+university.getName();
//        University searched = restTemplate.getForObject(
//          url,
//          University.class
//        );
//
//
//
        //create a university of feign client
//        University createdUniversity = feignRestClient.createUniversity(new University("Chuka university","Nakuru"));
//        System.out.println("Created University:"+createdUniversity.toString());
//
//
//        //Updating a university of feign client
//        University updateUniversity = new University("Cyril's University","Kenya");
//        updateUniversity=feignRestClient.update(createdUniversity.getId(),updateUniversity);
//        System.out.println("Updated university"+updateUniversity.toString());



        MockStudent mockStudent= mockfeignRestClient.createMockStudent(new MockStudent("94673","Cyril Owuor"));
        System.out.println("Registered Student"+mockStudent.toString());

        MockStudent searchByName = mockfeignRestClient.searchByName(mockStudent.getStudentNumber());
        System.out.println("Search returns"+searchByName);

        List<MockLecturer>lecturers = mockfeignRestClient.viewLecturers();
        System.out.println("Lecturers:"+lecturers);

        MockAppointment mockAppointment = mockfeignRestClient.createAppointment(new MockAppointment(mockStudent.getId(), lecturers.get(0).getId()));
        System.out.println("Created Appointment"+mockAppointment);

        MockAppointment confirmappointment = mockfeignRestClient.confirmAppointment(mockAppointment.getId(),mockStudent.getId());
        System.out.println("Appointment confirmed:"+confirmappointment);


    }
}
