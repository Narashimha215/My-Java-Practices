package com.kn.multithreading4;

public class ThreadDemo {

	public static void main(String[] args) {
		//Creating object of MyThread
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		//Setting name of threads
		t1.setName("Numbers");
		t2.setName("Characters");
		
		//Starting threads
		t1.start();
		t2.start();
	}
}