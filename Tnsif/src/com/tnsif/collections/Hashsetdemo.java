package com.tnsif.collections;

import java.util.HashSet;

public class Hashsetdemo {

	public static void main(String[] args) {
		HashSet hset= new HashSet<>();
		
		hset.add(44);
		hset.add("Harsha");
		
		hset.add(22);
		hset.add("Harsha");
		hset.add("Sai Kiran");
		
		System.out.println(hset);
		
		hset.remove(3);
		System.out.println("HashSet contains :"+hset.contains(hset));
		
	}

}