package com.tnsif.collections;


import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector vec =new Vector<>();
		
		vec.add("IT");
		vec.add("CSE");
		vec.add("ECE");
		vec.add("AIML");
		
		System.out.println("Vector Elements: "+vec);
		
		vec.remove(1);
		vec.remove(2);

		System.out.println("Vector Elements: "+vec);
		vec.addFirst("CSG");
		System.out.println("Vector Elements: "+vec);
		
	}

}
