package com.ics.demo.Spring.models;

public class MockLecturer {


    private Long id;

    private String name;


    public MockLecturer(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // empty constructor
    public MockLecturer() {
    }

    @Override // generate to .string method
    public String toString() {
        return "MockLecturer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
