package com.kn.multithreaading;

public class MyThread extends Thread {

	@Override // Task of Thread
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1);
	}
}