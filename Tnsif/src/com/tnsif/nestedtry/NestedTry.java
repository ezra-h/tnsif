package com.tnsif.nestedtry;

public class NestedTry {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        try {
            // Outer try block
            int[] numbers = {10, 20, 30};

            try {
                // Inner try block 1
                int a = 10, b = 0;
                int result = a / b;  
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e);
            }

            try {
                // Inner try block 2
                int value = numbers[5];  
                System.out.println("Value: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
            }

        } catch (Exception e) {
            // Outer catch handles any other exceptions
            System.out.println("Outer catch: " + e);
        }

        System.out.println("Program continues after handling exceptions...");
    }
}
