package com.kn.Polymopism;

public class MethodOverloading {

	public static void main(String[] args) {
		int a,b,c=0,d = 0;
		a=10;
		b=20;
		c=a+b;
		d = a+b+c;
		MethodOverloading mo = new MethodOverloading();
		mo.add(a,b,c);
		mo.add(a,b,c,d);
	}
	public void add(int a, int b,int c) {
		System.out.println(c);
	}
	public void add(int a, int b, int c, int d) {
		System.out.println(d);
	}
}