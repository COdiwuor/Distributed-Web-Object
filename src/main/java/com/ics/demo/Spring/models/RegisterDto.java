package com.ics.demo.Spring.models;

public class RegisterDto {
    private String studentNumber;
    private String firstName;

    public RegisterDto() {
    }

    public RegisterDto(String studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }
}

