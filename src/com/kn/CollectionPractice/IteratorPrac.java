package com.kn.CollectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class IteratorPrac {

	public static void main(String[] args) {
		//Iterator - Interface
		//Introduced for iterating the all collection objects
		//Legacy classes - v1.0 + New classes - v1.2
		//One Direction, read-only with special permission for removing the elements
		
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(5);
//		al.add(85);
//		al.add(56);
//		
//		Iterator<Integer> i = al.iterator();
//		//i.hasNext()
//		//i.next()
//		
////		while(i.hasNext()) {
////			//System.out.println(i.next());
////	
////	//		i.next();
////	//		i.remove();
////		}
//		
////		i.next();
////		i.remove();
//		System.out.println(al);
//		
//		Vector<Integer> ai = new Vector<>();
//		ai.add(5);
//		ai.add(85);
//		ai.add(56);
//		System.out.println(ai);
		
		HashMap<String , Integer> hm = new HashMap<>();
		hm.put("Banana", 500);
		hm.put("Cherry", 600);
		hm.put("Mango", 400);
		hm.put("Apple", 200);
		
//		hm.keySet().iterator();
//		hm.values().iterator();
//		hm.entrySet().iterator();
		System.out.println(hm);
	}
}