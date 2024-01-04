package com.kn.CollectionPractice;

import java.util.*;

public class ListIteratorPrac {

	public static void main(String[] args) {
		//ListIterator - Interface
		//Introduced for iterating the only list type collection objects
		//Legacy classes - v1.0 + New classes - v1.2
		//One Direction, read and write
		
	//	Vector<Integer> al = new Vector();
		ArrayList<Integer> al = new ArrayList();
		al.add(5);
		al.add(65);
		al.add(58);
		
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		li.add(45);
		System.out.println();
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		li.remove();
		System.out.println(al);
	}

}
