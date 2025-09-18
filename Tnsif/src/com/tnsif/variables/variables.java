package com.tnsif.variables;

public class variables {
	
	    int instanceVar = 10;
	    static int staticVar = 20;
	    public void displayVariables() {
	        int localVar = 5;
	        System.out.println("Local Variable: " + localVar);
	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Static Variable: " + staticVar);
	    }

	    public static void main(String[] args) {
	        variables obj = new variables();
	        obj.displayVariables();
	        System.out.println("Accessing Static Variable from main: " + variables.staticVar);
	    }
	}

