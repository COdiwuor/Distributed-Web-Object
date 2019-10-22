package com.ics.demo.Spring.models;

public class RejectDto {
    private long StudentId;
    private String reason;

    public RejectDto() {
    }

    public RejectDto(long studentId, String reason) {
        StudentId = studentId;
        this.reason = reason;
    }

    public long getStudentId() {
        return StudentId;
    }

    public String getReason() {
        return reason;
    }

}
