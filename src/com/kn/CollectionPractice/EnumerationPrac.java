package com.kn.CollectionPractice;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

public class EnumerationPrac {

	public static void main(String[] args) {
		//Enumeration - Interface
		//Introduced for iterating the legacy collection objects
		//Legacy classes - v1.0
		//HashTable, Stack, Vector, Dictionary and Properties
		//New Classes - v1.2
//		Vector<String> v = new Vector<>();
//		v.add("Banana");
//		v.add("Cherry");
//		v.add("Mango");
//		v.add("Apple");
//		Enumeration<String> e = v.elements();
//		//This is same as for each loop
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		
//		Hashtable<String, Integer> v = new Hashtable<>();
//		v.put("Banana", 500);
//		v.put("Cherry", 600);
//		v.put("Mango", 400);
//		v.put("Apple", 200);
//		Enumeration<Integer> e = v.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		
		Properties prop = new Properties();
		prop.setProperty("usl", "Localhost");
		prop.setProperty("username", "Admin");
		prop.setProperty("password", "Reddy");
		Enumeration<Object> e = prop.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}