package com.tnsif.staticmembers;

class Student {
    int rollNo;              
    String name;              
    static String college = "TKR College"; 
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    static void changeCollege(String newCollege) {
        college = newCollege;
    }
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    static {
        System.out.println("Static block executed before main method.");
    }
}
public class staticmembers {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Priya");
        s1.display();
        s2.display();
        Student.changeCollege("XYZ University");
        s1.display();
        s2.display();
    }
}
