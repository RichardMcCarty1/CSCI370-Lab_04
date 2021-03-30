package com.example.asynctask;

import java.util.ArrayList;

public class StudentDao {
    private ArrayList<Student> students = new ArrayList<Student>();
    public StudentDao() {
        students.add(new Student("Bob", "NotBob", "CSCI"));
        students.add(new Student("Matilda", "NotMatilda", "DS"));
        students.add(new Student("Carol", "NotCarol", "CIS"));
        students.add(new Student("Who", "NotWho", "Marketing"));
        students.add(new Student("Kyle", "NotKyle", "SomeRandomMajor"));
    }

    public ArrayList<Student> getAllStudents() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return students;
    }
}
