package com.kn.multithreaading;

public class ThreadDemo 
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println("Current Thread = "+t1);
	}
}