package com.tnsif.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet<>();
		
		lhs.add(44);
		lhs.add("Harsha");
		
		lhs.add(33);
		lhs.add("Bharath");
		System.out.println(lhs);
		
		lhs.add("Harsha");
		lhs.add("Sai Kiran Reddy");

	}

}