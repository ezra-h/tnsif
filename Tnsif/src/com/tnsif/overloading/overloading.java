package com.tnsif.overloading;

class methodoverloading {
    void display(int a, int b) {
        System.out.println("Method with int, int parameters: " + (a + b));
    }
    void display(double a, double b) {
        System.out.println("Method with double, double parameters: " + (a + b));
    }

    void display(int a, double b) {
        System.out.println("Method with int, double parameters: " + (a + b));
    }

    void display(double a, int b) {
        System.out.println("Method with double, int parameters: " + (a + b));
    }
}
public class overloading {

    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();

        obj.display(10, 20);          
        obj.display(5.5, 6.5);        
        obj.display(10, 15.5);        
        obj.display(7.5, 5);          
    }
}
