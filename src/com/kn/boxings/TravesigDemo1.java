package com.kn.boxings;

import java.util.*;
import java.util.List;

public class TravesigDemo1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		//Upcasting with collection objects
		List lst1 = new ArrayList<>();
		lst1.add(10);
		lst1.add(20);
		lst1.add(30);
		System.out.println(lst1);
		List lst2 = new LinkedList<>();
		lst2.add(10);
		lst2.add(20);
		lst2.add(30);
		System.out.println(lst2);
		Queue que = new ArrayDeque<>();
		que.add(10);
		que.add(20);
		que.add(30);
		System.out.println(que);
		Queue que2 = new PriorityQueue();
		que2.add(10);
		que2.add(20);
		que2.add(30);
		System.out.println(que2);
		System.out.println();
	}
}