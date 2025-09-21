package com.tnsif.wrapperclass;

public class Wrapperclass {
    public static void main(String[] args) {
        // ----- Wrapper Class Example -----
        int a = 10;
        char c = 'H';
        double d = 12.34;

        // Converting primitives into wrapper objects (Boxing)
        Integer intObj = Integer.valueOf(a);
        Character charObj = Character.valueOf(c);
        Double doubleObj = Double.valueOf(d);

        System.out.println("Wrapper Class Examples:");
        System.out.println("Integer Wrapper: " + intObj);
        System.out.println("Character Wrapper: " + charObj);
        System.out.println("Double Wrapper: " + doubleObj);

        // ----- Autoboxing Examples -----
        Integer num1 = 100;    // int → Integer
        Double num2 = 55.5;    // double → Double
        Character ch = 'A';    // char → Character

        System.out.println("\nAutoboxing Examples:");
        System.out.println("Integer: " + num1);
        System.out.println("Double: " + num2);
        System.out.println("Character: " + ch);

        // ----- Auto-unboxing Examples -----
        Integer num3 = 200;
        Double num4 = 99.99;
        Character ch2 = 'Z';

        int n1 = num3;     // Integer → int
        double n2 = num4;  // Double → double
        char c2 = ch2;     // Character → char

        System.out.println("\nAuto-unboxing Examples:");
        System.out.println("int: " + n1);
        System.out.println("double: " + n2);
        System.out.println("char: " + c2);
    }
}
