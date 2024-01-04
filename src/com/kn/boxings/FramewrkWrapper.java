package com.kn.boxings;

import java.util.ArrayList;
import java.util.Iterator;

public class FramewrkWrapper {

	public static void main(String[] args) {
		ArrayList<Object> list1 = new ArrayList<>();
		// Auto Boxing
		list1.add("Shirt");      
		list1.add("Jeans");      
		list1.add("cap");      
		list1.add(10); 
		list1.add(true); 
		
		//Using for loop
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		//Using for-each loop
		for(Object s:list1) {
			System.out.println(s+" ");
		}
		// Using Iterator
		@SuppressWarnings("rawtypes")
		Iterator itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
	}
}