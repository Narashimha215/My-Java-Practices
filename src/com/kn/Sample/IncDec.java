package com.kn.Sample;

public class IncDec 
{
	public static void main(String[] args) 
	{
		int a=10,b;
		b = a-- + a--;
		System.out.println(a);
		System.out.println(b);
		System.out.println("===============");
		int c=10,d;
		d = --c + --c + --c;
		System.out.println(c);
		System.out.println(d);
		System.out.println("===============");
//		int e=10,f;
//		f = ++e + ++e + ++e + ++e;
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println("===============");
		int e=10,f;
		f = ++e + ++e * e-- - --e + --e;
		System.out.println(e);
		System.out.println(f);
	}
}