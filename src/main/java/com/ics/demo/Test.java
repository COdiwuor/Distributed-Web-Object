package com.ics.demo;

import com.ics.demo.Spring.models.MockAppointment;
import com.ics.demo.Spring.models.MockLecturer;
import com.ics.demo.Spring.models.MockMatches;
import com.ics.demo.Spring.models.MockStudent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Test implements CommandLineRunner {
    private final FeignRestClient feignRestClient;
    private final MockFeignRestClient mockfeignRestClient; // Declare a feign client

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
//
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
        //create a university of feign client
//        University createdUniversity = feignRestClient.createUniversity(new University("Chuka university","Nakuru"));
//        System.out.println("Created University:"+createdUniversity.toString());
//
//
//        //Updating a university of feign client
//        University updateUniversity = new University("Cyril's University","Kenya");
//        updateUniversity=feignRestClient.update(createdUniversity.getId(),updateUniversity);
//        System.out.println("Updated university"+updateUniversity.toString());


        //MockStudent mockStudent = new MockStudent ("94673","Cyril Owuor ");
        //MockFeignRestClient.createMockStudent(mockStudent);
//        feignRestClient.RequestAttachment((long)6,(long)24);
//        feignRestClient.RequestDepartment((long)6,(long)24,(long)12);
//        feignRestClient.RejectDepartment(new Department(24,8,6));




        /*
         *Cat1
//         */
//        MockStudent mockStudent= mockfeignRestClient.createMockStudent(new MockStudent("94673","Cyril Owuor"));
//        System.out.println("Registered Student"+mockStudent.toString());
//
//        MockMatches mockMatches = mockfeignRestClient.searchByGender(mockStudent.getStudentNumber());
//        System.out.println("gender"+mockMatches);
//



//        MockStudent searchByName = mockfeignRestClient.searchByName(mockStudent.getStudentNumber());
//        System.out.println("Search returns"+searchByName);
//
//        List<MockLecturer> lecturers = mockfeignRestClient.viewLecturers();
//        System.out.println("Lecturers:"+lecturers);
//
//        MockAppointment mockAppointment1 = new MockAppointment(mockStudent.getId(), lecturers.get(0).getId());
//
//        MockAppointment mockAppointment = mockfeignRestClient.createAppointment(mockAppointment1);
//        System.out.println("Created Appointment"+mockAppointment);
//
//        MockAppointment confirmappointment = mockfeignRestClient.confirmAppointment(mockAppointment.getId(),mockStudent.getId());
//        System.out.println("Appointment confirmed:"+confirmappointment);

    }

}
