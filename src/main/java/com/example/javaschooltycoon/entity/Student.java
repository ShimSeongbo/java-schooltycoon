package com.example.javaschooltycoon.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person{
    private int studentID;
    private String grade;

    public Student(String name, int age, int studentID, String grade) {
        super(name, age);
        this.studentID = studentID;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + ", 학번: " + studentID + ", 학년: " + grade;
    }
}
