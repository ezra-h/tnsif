package com.tnsif.junit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class Calculator {
    public double add(int a, int b) {
        return a + b;
    }

    public double sub(int a, int b) {
        return a - b;
    }

    public double mult(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero not allowed");
        return a / b;
    }

    public double mod(int a, int b) {
        return a % b;
    }
}

public class JunitExampleDemo {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Addition: " + obj.add(10, 20));
        System.out.println("Subtraction: " + obj.sub(20, 10));
        System.out.println("Multiplication: " + obj.mult(12, 25));
        System.out.println("Division: " + obj.div(10, 2));
        System.out.println("Modulus: " + obj.mod(10, 3));

    }

    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    static class CalculatorTests {

        static Calculator obj;

        @BeforeAll
        static void setup() {
            obj = new Calculator();
            System.out.println("\n--- Starting Tests ---");
        }

        @Test
        @Order(1)
        void testAddition() {
            assertEquals(15, obj.add(10, 5), "Addition test failed");
        }

        @Test
        @Order(2)
        void testSubtraction() {
            assertEquals(5, obj.sub(10, 5), "Subtraction test failed");
        }

        @Test
        @Order(3)
        void testMultiplication() {
            assertEquals(50, obj.mult(10, 5), "Multiplication test failed");
        }

        @Test
        @Order(4)
        void testDivision() {
            assertEquals(2, obj.div(10, 5), "Division test failed");
        }

        @Test
        @Order(5)
        void testDivisionByZero() {
            assertThrows(ArithmeticException.class, () -> obj.div(10, 0));
        }

        @AfterAll
        static void done() {
            System.out.println("--- All Tests Completed ---");
        }
    }
}