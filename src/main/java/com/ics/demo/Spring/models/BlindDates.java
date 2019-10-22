package com.ics.demo.Spring.models;

public class BlindDates {
    private long id;
    private Student student;
    private MockMatches match;
    private MockMatches requested;
    private String reason;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public MockMatches getMatch() {
        return match;
    }

    public void setMatch(MockMatches match) {
        this.match = match;
    }

    public MockMatches getRequested() {
        return requested;
    }

    public void setRequested(MockMatches requested) {
        this.requested = requested;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    public BlindDates() {
    }

    @Override
    public String toString() {
        return "BlindDates{" +
                "id=" + id +
                ", student=" + student +
                ", match=" + match +
                ", requested=" + requested +
                ", reason='" + reason + '\'' +
                '}';
    }
}
