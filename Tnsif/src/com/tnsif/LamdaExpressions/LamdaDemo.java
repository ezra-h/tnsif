package com.tnsif.LamdaExpressions;

import java.util.Arrays;
import java.util.List;

interface Addable{
	int add(int a ,int b); 
};

public class LamdaDemo {

	public static void main(String[] args) {
		
		List<String> names =Arrays.asList("Harsha","Praneeth","Sai kiran","Sanjay");
		names.forEach(name->System.out.println("Hello "+ name));
		
		Addable obj =(a,b)->{
			System.out.println("Adding Numbers...");
			return a+b;
		};
		System.out.println("Result: "+obj.add(10, 15));
		
	}

}