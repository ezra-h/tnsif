package com.tnsif.ExtendedInterfaces;

interface Animal {
 void eat();
}

interface Dog extends Animal {
 void bark();
}

class Puppy implements Dog {
 public void eat() {
     System.out.println("Puppy is eating...");
 }

 public void bark() {
     System.out.println("Puppy is barking...");
 }
}

public class ExtendedInterfaces {
 public static void main(String[] args) {
     Puppy p = new Puppy();
     p.eat();   
     p.bark();  
 }
}
