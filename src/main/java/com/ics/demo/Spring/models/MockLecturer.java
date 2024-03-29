package com.ics.demo.Spring.models;

public class MockLecturer {
    //Private Instance Properties
    private Long id;
    private String name;

    //public properties
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
    // generate toString method
    @Override
    public String toString() {
        return "MockLecturer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
