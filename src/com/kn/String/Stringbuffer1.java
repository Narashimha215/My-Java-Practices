package com.kn.String;
public class Stringbuffer1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("Ram");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println("*************************");
		sb1.append(" sita");
		sb1.append(" sita");
		sb1.append(" sita");
		sb1.append(" sita");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}
}