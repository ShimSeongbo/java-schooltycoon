package com.example.javaschooltycoon.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher extends Person {
    private int teacherID;
    private String subject;

    public Teacher(String name, int age, int teacherID, String subject) {
        super(name, age);
        this.teacherID = teacherID;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", 교번: " + teacherID + ", 과목: " + subject;
    }
}
