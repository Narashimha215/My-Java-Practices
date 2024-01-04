package com.kn.ArrayDeque;

import java.util.ArrayDeque;

public class CollectionsDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20.5);
		ad.add("Thirty");
		ad.add(true);
		System.out.println("First= "+ad.getFirst());  //First= 10
		System.out.println("Last= "+ad.getLast());  //Last= true
		ad.addFirst(111);
		ad.addLast(999);
		System.out.println("First= "+ad.getFirst());  //First= 111
		System.out.println("Last= "+ad.getLast());  //Last= 999
		System.out.println(ad);  //[111, 10, 20.5, Thirty, true, 999]
	}
}