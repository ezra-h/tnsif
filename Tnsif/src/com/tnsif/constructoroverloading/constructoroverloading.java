package com.tnsif.constructoroverloading;

class Student {
    String name;
    int age;
    String course;

    // Constructor 1 - no arguments
    Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    // Constructor 2 - one argument
    Student(String n) {
        name = n;
        age = 0;
        course = "Not Assigned";
    }

    // Constructor 3 - two arguments
    Student(String n, int a) {
        name = n;
        age = a;
        course = "Not Assigned";
    }

    // Constructor 4 - three arguments
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
        // Calling different constructors
        Student s1 = new Student();
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Priya", 20);
        Student s4 = new Student("Arjun", 22, "Computer Science");

        // Displaying student details
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
