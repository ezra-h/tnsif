package com.tnsif.MultipleInterfaces;

interface Animal {
 void eat();
}

interface Pet {
 void play();
}

class Dog implements Animal, Pet {
 public void eat() {
     System.out.println("Dog is eating...");
 }

 public void play() {
     System.out.println("Dog is playing...");
 }
}

public class MultipleInterfaces {
 public static void main(String[] args) {
     Dog d = new Dog();
     d.eat();   
     d.play(); 
 }
}
