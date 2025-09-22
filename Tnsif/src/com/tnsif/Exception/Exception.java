package com.tnsif.Exception;

public class Exception {
    public static void main(String[] args) {
        String str = "Hello";

        try {
            char ch = str.charAt(10);
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("String length: " + str.length());
            System.out.println("You tried to access an index outside the valid range!");
        }

        System.out.println("Program continues after handling exception...");
    }
}
