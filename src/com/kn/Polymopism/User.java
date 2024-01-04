package com.kn.Polymopism;

public class User {

	public static void main(String[] args) {
		int a=30,b=20,c,d,e,f;
		c=a+b;
		d=c+a+b;
		e=a-b;
		f=c-a;
		Lenovo le = new Lenovo();
		le.copy(a,b,c);
		le.keyboard(a, b, c, d);
		le.paste(a,b,e);
		le.cut(a,c,f);
	}
}