package com.kn.CollectionPractice;

import java.util.Stack;

public class StackCol {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("Sai");
		s.push("Ram");
		s.add("Mani");
		s.push("Raj");
		s.push("Ram");
		s.add(null);
		s.add("Mani");
		s.push("Reddy");
		s.add("Siva");
		s.push(null);
		System.out.println(s);
		s.pop();
		System.out.println(s.peek());
		
		System.out.println(s.search("Sai"));
		for(String st : s) {
			System.out.println(st);
		}
		
	}
}
/*Stack :
 * default capacity= 10
 * Initial capacity = 10
 * Does it allow duplicate elements = Yes
 * Does it allow null values = Yes
 * Does it Maintain the insertion order = Yes
 * Does it Maintain the sorted order = No
 * Does it offer the random access of elements = Yes
 * Is it synchronised = No
 * What is it good at = 
*/