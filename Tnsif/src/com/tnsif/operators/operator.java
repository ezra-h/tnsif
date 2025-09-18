package com.tnsif.operators;

public class operator {
	    public static void main(String[] args) {
	        // --- 1. Arithmetic Operators ---
	        int a = 10, b = 3;
	        System.out.println("Arithmetic Operators:");
	        System.out.println("a + b = " + (a + b));  // Addition
	        System.out.println("a - b = " + (a - b));  // Subtraction
	        System.out.println("a * b = " + (a * b));  // Multiplication
	        System.out.println("a / b = " + (a / b));  // Division
	        System.out.println("a % b = " + (a % b));  // Modulus

	        // --- 2. Relational (Comparison) Operators ---
	        System.out.println("\nRelational Operators:");
	        System.out.println("a == b: " + (a == b));  // Equal to
	        System.out.println("a != b: " + (a != b));  // Not equal to
	        System.out.println("a > b: " + (a > b));    // Greater than
	        System.out.println("a < b: " + (a < b));    // Less than
	        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
	        System.out.println("a <= b: " + (a <= b));  // Less than or equal to

	        // --- 3. Logical Operators ---
	        boolean x = true, y = false;
	        System.out.println("\nLogical Operators:");
	        System.out.println("x && y: " + (x && y));  // Logical AND
	        System.out.println("x || y: " + (x || y));  // Logical OR
	        System.out.println("!x: " + (!x));          // Logical NOT

	        // --- 4. Assignment Operators ---
	        int num = 5;
	        System.out.println("\nAssignment Operators:");
	        System.out.println("Initial num: " + num);
	        num += 3;  // Equivalent to num = num + 3
	        System.out.println("num += 3: " + num);
	        num -= 2;
	        System.out.println("num -= 2: " + num);
	        num *= 2;
	        System.out.println("num *= 2: " + num);
	        num /= 2;
	        System.out.println("num /= 2: " + num);
	        num %= 3;
	        System.out.println("num %= 3: " + num);

	        // --- 5. Unary Operators ---
	        int c = 5;
	        System.out.println("\nUnary Operators:");
	        System.out.println("c = " + c);
	        System.out.println("++c = " + (++c));  // Pre-increment
	        System.out.println("c++ = " + (c++));  // Post-increment
	        System.out.println("After c++: " + c);
	        System.out.println("--c = " + (--c));  // Pre-decrement
	        System.out.println("c-- = " + (c--));  // Post-decrement
	        System.out.println("After c--: " + c);
	        System.out.println("-c = " + (-c));    // Unary minus

	        // --- 6. Bitwise Operators ---
	        int p = 5, q = 3;
	        System.out.println("\nBitwise Operators:");
	        System.out.println("p & q = " + (p & q));  // AND
	        System.out.println("p | q = " + (p | q));  // OR
	        System.out.println("p ^ q = " + (p ^ q));  // XOR
	        System.out.println("~p = " + (~p));        // Bitwise NOT
	        System.out.println("p << 1 = " + (p << 1)); // Left shift
	        System.out.println("p >> 1 = " + (p >> 1)); // Right shift

	        // --- 7. Ternary Operator ---
	        int max = (a > b) ? a : b;
	        System.out.println("\nTernary Operator:");
	        System.out.println("Max of a and b: " + max);
	    }
	}


