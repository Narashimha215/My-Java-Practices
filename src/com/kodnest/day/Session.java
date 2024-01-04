package com.kodnest.day;
public class Session 
{
	public static void main(String[] args) 
	{
		int a=0,b=0;
		long k = (long)43.99;
		System.out.println(a);
		System.out.println(b+k);
		System.out.println(b++);
		System.out.println(++b);
		a=a++ + ++a + a++;
		b=a;
		System.out.println(b);
	}
}