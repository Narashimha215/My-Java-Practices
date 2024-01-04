package com.kn.String;

public class StringBulderDemo {

	public static void main(String[] args) 
	{
		StringBuilder stringBuilder1 = new StringBuilder("Ram");
		System.out.println("Date = "+stringBuilder1);
		System.out.println("length = "+stringBuilder1.length());
		System.out.println("Capacity = "+stringBuilder1.capacity());
		System.out.println("**************************");
		stringBuilder1 = stringBuilder1.append("sita");
		System.out.println("Date = "+stringBuilder1);
		System.out.println("length = "+stringBuilder1.length());
		System.out.println("Capacity = "+stringBuilder1.capacity());
	}
}