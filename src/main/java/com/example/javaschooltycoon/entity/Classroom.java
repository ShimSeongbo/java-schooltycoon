package com.example.javaschooltycoon.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Classroom {
    private String name;
    private Teacher teacher;
    private List<Student> students;

    private Classroom() {
        this.students = new ArrayList<>();
    }

    public static class Builder {
        private String name;
        private Teacher teacher;
        private List<Student> students = new ArrayList<>();

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setTeacher(Teacher teacher) {
            this.teacher = teacher;
            return this;
        }

        public Builder addStudent(Student student) {
            this.students.add(student);
            return this;
        }

        public Classroom build() {
            Classroom classroom = new Classroom();
            classroom.name = this.name;
            classroom.teacher = this.teacher;
            classroom.students = this.students;
            return classroom;
        }
    }

    @Override
    public String toString() {
        return name + " (" + teacher.getName() + " 선생님) - 학생수: " + students.size();
    }
}
