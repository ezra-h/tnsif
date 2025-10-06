package com.tnsif.hierarchy;

class Animals{
 void eat() {
     System.out.println("Animals can eat");
 }
}
class Dogs extends Animals {
 void bark() {
     System.out.println("Dog barks");
 }
}
class Cats extends Animals {
 void meow() {
     System.out.println("Cat meows");
 }
}
public class Hierarchyinheritance {
 public static void main(String[] args) {
     Dogs dog = new Dogs();
     Cats cat = new Cats();
     dog.eat();
     dog.bark();
     System.out.println(); 
     cat.eat();
     cat.meow();
 }
}

