package com.tnsif.evenorodd;

	import java.util.Scanner;
	public class evenorodd{
		public static void main(String []args) {
			Scanner input = new Scanner(System.in);  // Create Scanner object

	        System.out.print("Enter a number: ");
	        int number = input.nextInt();  // Take number input at runtime

	        if (number % 2 == 0) {
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        }

	        input.close();  // Close the Scanner
	    }
	}

