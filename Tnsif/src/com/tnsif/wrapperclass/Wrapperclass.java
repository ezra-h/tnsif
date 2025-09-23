package com.tnsif.wrapperclass;

public class Wrapperclass {
    public static void main(String[] args) {
        int a = 10;
        char c = 'H';
        double d = 12.34;       
        Integer intObj = Integer.valueOf(a);
        Character charObj = Character.valueOf(c);
        Double doubleObj = Double.valueOf(d);
        System.out.println("Wrapper Class Examples:");
        System.out.println("Integer Wrapper: " + intObj);
        System.out.println("Character Wrapper: " + charObj);
        System.out.println("Double Wrapper: " + doubleObj);
        Integer num1 = 100;    
        Double num2 = 55.5;    
        Character ch = 'A';    

        System.out.println("\nAutoboxing Examples:");
        System.out.println("Integer: " + num1);
        System.out.println("Double: " + num2);
        System.out.println("Character: " + ch);        
        Integer num3 = 200;
        Double num4 = 99.99;
        Character ch2 = 'Z';
        int n1 = num3;   
        double n2 = num4;  
        char c2 = ch2;     
       System.out.println("\nAuto-unboxing Examples:");
        System.out.println("int: " + n1);
        System.out.println("double: " + n2);
        System.out.println("char: " + c2);
    }
}
