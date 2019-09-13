package com.ics.demo;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.HTTP_VERSION_NOT_SUPPORTED)
public class NotFoundException extends RuntimeException {
    //constructor
     public NotFoundException(String message){
         super(message);
     }
}
