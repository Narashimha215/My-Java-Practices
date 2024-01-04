package com.kn.CollectionPractice;

import java.util.*;

public class LinkeListPractice {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Y1");
		l1.add("Y2");
		l1.add("Y3");
		l1.add("Y3");
		l1.add(null);
		ArrayList<String> al = new ArrayList<>();
		al.add("A1");
		al.add("A2");
		l1.add(null);
		l1.add("Y3");
		
		l1.addAll(0,al);
		l1.set(2,"AA");
		l1.add("Y3");
		l1.remove(5);
		
		System.out.println(l1);
		System.out.println(l1.get(2));
		Collections.synchronizedList(l1);
		for(String s : l1) {
			System.out.println(s);
		}
	}
}
/*LinkedList :
 * default capacity= 0
 * Initial capacity = 0
 * Does it allow duplicate elements = Yes
 * Does it allow null values = Yes
 * Does it Maintain the insertion order = Yes
 * Does it Maintain the sorted order = No
 * Does it offer the random access of elements = Yes
 * Is it synchronized = By default No.(by using collections we can synchronize)
 * What is it good at = data manipulation is good
*/