package com.kn.boxings;
import java.util.ArrayList;
import java.util.ListIterator;

public class TraversingDemo1 {
	public static void main(String[] args) {
		// Backward Traversing for list implementing classes
		ArrayList<Integer> ad =new ArrayList<>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		// Using Iterator
		ListIterator<Integer> itr = ad.listIterator(ad.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
