package com.example.javaschooltycoon;

import com.example.javaschooltycoon.entity.Classroom;
import com.example.javaschooltycoon.entity.School;
import com.example.javaschooltycoon.entity.Student;
import com.example.javaschooltycoon.entity.Teacher;

public class SchoolTycoon {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 16, 1001, "10학년");
        Teacher teacher1 = new Teacher("이몽룡", 40, 2001, "수학");
        Classroom classroom1 = new Classroom.Builder()
                .setName("1반")
                .setTeacher(teacher1)
                .addStudent(student1)
                .build();


        School school = new School.Builder()
                .addTeacher(teacher1)
                .addStudent(student1)
                .addClassroom(classroom1)
                .build();


        System.out.println(student1);
        System.out.println(teacher1);
        System.out.println(classroom1);
        System.out.println(school);
    }
}
