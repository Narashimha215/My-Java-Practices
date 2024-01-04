package com.kn.boxings;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TraversingDemo {

	public static void main(String[] args) 
	{
		// Backward Traversing for list implementing classes
		ArrayDeque<Integer> ad =new ArrayDeque<>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(256);
		@SuppressWarnings("rawtypes")
		// Using Iterator
		Iterator itr = ad.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}