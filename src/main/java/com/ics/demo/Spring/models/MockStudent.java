package com.ics.demo.Spring.models;


import javax.persistence.Entity;
import javax.persistence.Table;


public class MockStudent {

    private long id;

    private String studentNumber;

    private String firstName;


    public MockStudent(String studentNumber, String firstName){
        this.studentNumber = studentNumber;
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public MockStudent() {
    }

    public interface Create{};

    public interface Update{};


    @Override
    public String toString() {
        return "MockStudent{" +
                "id=" + id +
                ", StudentNumber=" + studentNumber +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
