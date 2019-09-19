package com.ics.demo.Spring;

import com.ics.demo.FeignRestClient;
import com.ics.demo.Spring.models.University;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Test implements CommandLineRunner {
    private final FeignRestClient feignRestClient;// Declare a feign client

    public Test(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
//        RestTemplate restTemplate = new RestTemplate();
//
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

        //create a university of feign client
        University createdUniversity = feignRestClient.createUniversity(new University("Kabarak university","Nakuru"));
        System.out.println("Created University:"+createdUniversity.toString());


        //Updating a university of feign client
        University updateUniversity = new University("Cyril's University","Kenya");
        updateUniversity=feignRestClient.update(createdUniversity.getId(),updateUniversity);
        System.out.println("Updated my university"+updateUniversity.toString());
    }
}
