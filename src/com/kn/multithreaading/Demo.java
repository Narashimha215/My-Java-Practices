package com.kn.multithreaading;

public class Demo {

	public static void main(String[] args) {
		//Creating the objects of classes
		//Having independent activities
		PrintNumber pn = new PrintNumber();
		PrintChar pc = new PrintChar();
		
		//Creating Thread class object and assigning activities
		Thread t1 = new Thread(pn);
		Thread t2 = new Thread(pc);
		
		//Starting the threads
		t1.start();
		t2.start();
	}
}
