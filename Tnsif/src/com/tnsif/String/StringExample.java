package com.tnsif.String;

public class StringExample {
    public static void main(String[] args) {
       
        String str = "Hello";
        str = str + " World";  
        System.out.println("String Example: " + str);

        // ----- StringBuffer Example -----
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  
        sb.insert(6, "Java "); 
        sb.reverse();          
        System.out.println("StringBuffer Example: " + sb);

        // ----- StringBuilder Example -----
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");  
        sb2.replace(6, 11, "Java"); 
        sb2.delete(0, 6);       
        System.out.println("StringBuilder Example: " + sb2);
    }
}
