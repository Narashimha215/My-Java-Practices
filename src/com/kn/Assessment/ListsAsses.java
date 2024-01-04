package com.kn.Assessment;

import java.util.*;

public class ListsAsses {

	public static void main(String[] args) {
		//1. Sum and Average 
		ArrayList<Integer> a = new ArrayList<>();
		a.add(4);
		a.add(5);
		a.add(0);
		a.add(9);
		a.add(8);
		a.add(10);
//		int sum=0;
//		for(int i:a)
//		{
//			sum+=i;
//		}
//		double ave = sum/a.size();
//		System.out.println("Sum = "+sum+" & Average = "+ave);
		
		//2. Sum of even numbers
//		for(int i:a)
//		{
//			if(i%2==0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
		//3. split a list into two arrays
		
//		List lst1 = new ArrayList<>(a.subList(0, a.size()/2));
//		List lst2 = new ArrayList<>(a.subList(a.size()/2,a.size()));
//		System.out.println("List1: "+lst1);
//		System.out.println("List2: "+lst2);
		
		//4. Merge two lists into a single list
//		Vector<Integer> v1 = new Vector<>();
//		v1.add(4);
//		v1.add(5);
//		v1.add(6);
//		Vector<Integer> v2 = new Vector<>();
//		v2.add(7);
//		v2.add(8);
//		v2.add(9);
//		List<Integer> lst1 = new ArrayList<>(v1);
//		lst1.addAll(v2);
//		System.out.println(lst1);
		
		//5.Repeated elements along with its count
		Stack<String> s = new Stack<>();
		s.add("baby");
		s.add("ball");
		s.add("soap");
		s.add("baby");
		s.add("Shampoo");
		s.add("chalk");
		s.add("soap");
		s.add("baby");
		s.add("Makeup");
		s.add("lotion");
		int count=0;
		for(String s1 : s) {
			if(s1=="baby") {
				count++;
			}
		}
		System.out.println("baby = "+count);
		int count1=0;
		for(String s1 : s) {
			if(s1=="soap") {
				count1++;
			}
		}
		System.out.println("soap = "+count1);
	}
}