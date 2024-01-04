package com.kn.Inheritance;

public class Laptop {

	public static void main(String[] args) {
		Hp h = new Hp();
		h.copy();
		h.cut();
		h.keyboard();
		h.paste();
		Lenovo l = new Lenovo();
		l.cut();
		l.keyboard();
	}
}