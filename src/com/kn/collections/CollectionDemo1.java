package com.kn.collections;

import java.util.ArrayList;

public class CollectionDemo1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		@SuppressWarnings("rawtypes")
		ArrayList l2 = new ArrayList();
		l2.add("Ten");
		l2.add("Two");
		l2.add("Three");
		l2.add("Four");
		l2.add("Five");
		System.out.println(l2);
//		l2.addAll(l1);
//		System.out.println(l2);//[Ten, Two, Three, Four, Five, 10, 20, 30, 40, 50]
		l2.addAll(2,l1);
		System.out.println(l2);//[Ten, Two, 10, 20, 30, 40, 50, Three, Four, Five]
		@SuppressWarnings("rawtypes")
		ArrayList l3 = new ArrayList();
		l3.add(10);
		l3.add(20);
		l3.add(30);
		l3.add(40);
		l3.add(50);
		l3.add(3,1111);
		System.out.println(l3);//[10, 20, 30, 1111, 40, 50]
		l3.set(3,333);
		System.out.println(l3);//[10, 20, 30, 333, 40, 50]
		System.out.println(l3.get(2));//30
		@SuppressWarnings("rawtypes")
		ArrayList l4 = new ArrayList();
		l4.add(10);
		l4.add(20);
		l4.add(30);
		l4.add(1,11);
		l4.add(1,22);
		l4.add(10);
        System.out.println(l4);
        System.out.println(l4.get(2));
        System.out.println("IndexOf(10) = "+l4.indexOf(10));
        System.out.println("lastIndexOf(10) = "+l4.lastIndexOf(10));
	}

}
