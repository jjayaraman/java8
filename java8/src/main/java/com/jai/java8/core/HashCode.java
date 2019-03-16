package com.jai.java8.core;

import java.util.HashMap;
import java.util.Map;

public class HashCode {

    private Map<Student, String> students = new HashMap<Student, String>();

    public static void main(String[] args) {

        HashCode demo = new HashCode();

        Student maths = new Student(1, "maths", 99);
        Student science = new Student(1, "science", 90);
        Student history = new Student(1, "history", 80);

        demo.add(maths, "jay");
        demo.add(science, "jay");
        demo.add(history, "jay");


//        int n = 16;
//        System.out.println("CLARK".hashCode() & (n-1));
//        System.out.println("KING".hashCode() & (n-1));
    }

    public void add(Student student, String name) {
        this.students.put(student, name);
    }
}


class Student {

    private int id;
    private String subject;
    private int mark;

    public Student(int id, String subject, int mark) {
        this.id = id;
        this.subject = subject;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

}
