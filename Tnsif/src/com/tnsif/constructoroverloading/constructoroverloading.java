package com.tnsif.constructoroverloading;

class Student {
    String name;
    int age;
    String course;
    Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }
    Student(String n) {
        name = n;
        age = 0;
        course = "Not Assigned";
    }
    Student(String n, int a) {
        name = n;
        age = a;
        course = "Not Assigned";
    }
    Student(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}
public class constructoroverloading {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Priya", 20);
        Student s4 = new Student("Arjun", 22, "Computer Science");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
