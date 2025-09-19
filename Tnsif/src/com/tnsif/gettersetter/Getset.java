package com.tnsif.gettersetter;

public class Getset {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;   // 'this' distinguishes instance variable
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if(age > 0) {   // validation example
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Getset s = new Getset();
        s.setName("Harsha");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
