package com.company.lab;

public class Student {
    String name;
    int age;
    float mark1,mark2;
    float media;

    public Student(String name, float mark1, float mark2, int age) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.age = age;
        media = (mark1+mark2)/2;
    }
    public Student(String name) {
    this.name = name; }
}
