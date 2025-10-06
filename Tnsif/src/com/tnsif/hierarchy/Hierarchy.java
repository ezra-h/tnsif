package com.tnsif.hierarchy;

class Animal {
 void eat() {
     System.out.println("Animals can eat");
 }
}
class Mammal extends Animal {
 void walk() {
     System.out.println("Mammals can walk");
 }
}
class Dog extends Mammal {
 void bark() {
     System.out.println("Dogs can bark");
 }
}
public class Hierarchy{
 public static void main(String[] args) {
     Dog dog = new Dog();
     
     
     dog.eat();  
     dog.walk();  
     dog.bark();  
 }
}
