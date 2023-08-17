package com.example.javaschooltycoon.entity;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private List<Classroom> classrooms;

    private School() {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.classrooms = new ArrayList<>();
    }

    public static class Builder {
        private List<Teacher> teachers = new ArrayList<>();
        private List<Student> students = new ArrayList<>();
        private List<Classroom> classrooms = new ArrayList<>();

        public Builder addTeacher(Teacher teacher) {
            this.teachers.add(teacher);
            return this;
        }

        public Builder addStudent(Student student) {
            this.students.add(student);
            return this;
        }

        public Builder addClassroom(Classroom classroom) {
            this.classrooms.add(classroom);
            return this;
        }

        public School build() {
            School school = new School();
            school.teachers = this.teachers;
            school.students = this.students;
            school.classrooms = this.classrooms;
            return school;
        }
    }

    @Override
    public String toString() {
        return "학교 정보: 선생님 " + teachers.size() + "명, 학생 " + students.size() + "명, 교실 " + classrooms.size() + "개";
    }
}