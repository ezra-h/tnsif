package com.tnsif.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list =new LinkedList<>();
		
		list.add(44);
		list.add("Harsha");
		
		list.add("C8");
		list.add("Madhuveer Reddy");
		
		list.addFirst(33);
		list.addLast("Dinesh Reddy");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);

	}

}