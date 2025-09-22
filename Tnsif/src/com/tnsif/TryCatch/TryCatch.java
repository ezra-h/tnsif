package com.tnsif.TryCatch;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You cannot divide a number by zero!");
        }
        System.out.println("Program continues after handling exception...");
    }
}
