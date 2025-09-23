package com.tnsif.nestedtry;

public class NestedTry {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        try {
           
            int[] numbers = {10, 20, 30};

            try {                
                int a = 10, b = 0;
                int result = a / b;  
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e);
            }

            try {              
                int value = numbers[5];  
                System.out.println("Value: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
            }

        } catch (Exception e) {
            System.out.println("Outer catch: " + e);
        }

        System.out.println("Program continues after handling exceptions...");
    }
}
