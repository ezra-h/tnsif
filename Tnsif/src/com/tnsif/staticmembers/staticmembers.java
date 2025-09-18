package com.tnsif.staticmembers;

class Student {
    int rollNo;               // instance variable
    String name;              // instance variable
    static String college = "TKR College"; // static variable (shared by all objects)

    // constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    // method to display details
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    // static block
    static {
        System.out.println("Static block executed before main method.");
    }
}
public class staticmembers {
    public static void main(String[] args) {
        // static block runs automatically before this line
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Priya");

        s1.display();
        s2.display();

        // changing college name using static method
        Student.changeCollege("XYZ University");

        s1.display();
        s2.display();
    }
}
