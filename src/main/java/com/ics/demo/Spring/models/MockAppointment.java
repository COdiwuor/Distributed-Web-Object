package com.ics.demo.Spring.models;

public class MockAppointment {

    private Long id;
    private Long studentId;
    private Long lecturerId;

    public MockAppointment(Long studentId, Long lecturerId) {
        this.studentId = studentId;
        this.lecturerId = lecturerId;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getLecturerId() {
        return lecturerId;
    }
    public void setLecturerId(Long lecturerId) {
        this.lecturerId = lecturerId;
    }

    public MockAppointment() {
    }

    @Override
    public String toString() {
        return "MockAppointment{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", lecturerId=" + lecturerId +
                '}';
    }
}
