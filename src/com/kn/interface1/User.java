package com.kn.interface1;

public class User {
	public static void main(String[] args) {
		Lenova len = new Lenova();
		Hp hp = new Hp();
		Apple app = new Apple();
		len.copy();
		len.cut();
		len.paste();
		len.keyboard();
		len.security();
		len.capture();
		Laptop.capture();
		
		hp.copy();
		hp.cut();
		hp.paste();
		hp.keyboard();
		hp.security();
		Laptop.capture();
		
		app.copy();
		app.cut();
		app.paste();
		app.keyboard();
		app.security();
		Laptop.capture();
	}
}