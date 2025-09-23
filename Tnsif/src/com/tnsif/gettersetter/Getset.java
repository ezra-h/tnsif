package com.tnsif.gettersetter;

public class Getset {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;  
    } 
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0) {  
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
