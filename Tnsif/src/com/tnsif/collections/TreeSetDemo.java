package com.tnsif.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
	TreeSet<String> ts =new TreeSet<>();
	
	
	ts.add("Harsha");
	ts.add("Madhuveer Reddy");
	ts.add("C8");
	ts.add("Prashanth Reddy");
	ts.add("Sanjay");
	System.out.println(ts);
	
	System.out.println(ts.getFirst());
	
	System.out.println(ts.getLast());
	
	System.out.println(ts.removeFirst());
	System.out.println(ts.removeLast());
	
	System.out.println(ts);

	

	}

}
