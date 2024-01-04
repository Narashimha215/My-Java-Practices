package com.kn.collections;

import java.util.ArrayList;

public class CoolectionsDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList l = new ArrayList();
		l.add(100);
		l.add(10.50);
		l.add(true);
		l.add('a');
		l.add("ten");
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(40);
		l.add(111);
		System.out.println(l);
		System.out.println(l.size());
	}
}