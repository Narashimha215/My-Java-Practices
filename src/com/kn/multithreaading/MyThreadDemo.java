package com.kn.multithreaading;

public class MyThreadDemo {

	public static void main(String[] args) 
	{
		Thread t2 = Thread.currentThread();
		System.out.println(t2);
		
		MyThread t1 = new MyThread();
		t1.start();
		t1.setName("MyThread");
		t1.setPriority(6);
	}
}