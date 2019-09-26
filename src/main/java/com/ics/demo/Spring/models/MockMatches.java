package com.ics.demo.Spring.models;

public class MockMatches {

    private Long id;
    private String MALE;
    private String FEMALE;

    public MockMatches(String MALE, String FEMALE) {
        this.MALE = MALE;
        this.FEMALE = FEMALE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMALE() {
        return MALE;
    }

    public void setMALE(String MALE) {
        this.MALE = MALE;
    }

    public String getFEMALE() {
        return FEMALE;
    }

    public void setFEMALE(String FEMALE) {
        this.FEMALE = FEMALE;
    }

    public MockMatches() {
    }

    @Override
    public String toString() {
        return "MockMatches{" +
                "id=" + id +
                ", MALE='" + MALE + '\'' +
                ", FEMALE='" + FEMALE + '\'' +
                '}';
    }
}
