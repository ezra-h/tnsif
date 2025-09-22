package com.tnsif.multipecatch;

public class Multiplecatch {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        try {
            int[] numbers = {10, 20, 30};
            int a = 10, b = 0;

            // Uncomment one at a time to see different exceptions

         //   int result = a / b;              // ArithmeticException
            // int value = numbers[5];      // ArrayIndexOutOfBoundsException
             String str = null; 
             System.out.println(str.length()); // NullPointerException

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        } catch (Exception e) {
            System.out.println("Caught general Exception: " + e);
        }

        System.out.println("Program continues after handling exception...");
    }
}

