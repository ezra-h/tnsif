package com.tnsif.armstrong;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number;
        int result = 0;

        // Find number of digits
        int digits = String.valueOf(number).length();

        // Calculate sum of powers of digits
        while (number > 0) {
            int digit = number % 10;
            result += Math.pow(digit, digits);
            number /= 10;
        }

        // Check Armstrong condition
        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
