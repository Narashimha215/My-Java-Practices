package com.kn.concurent;

import java.util.ArrayList;

public class ConcurrentDemo {

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		int temp =40;
		for(int i=0;i<list.size()-1;i++) {
			System.out.println(list);
		}
	}
}