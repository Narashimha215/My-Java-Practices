package com.kn.multithreading;

public class Chatting extends Thread
{
	@Override
	public void run() {
		try {
			System.out.println("Chatting Started");
			Thread.sleep(2000);
			System.out.println("Chit Chat Chit Chat");
			Thread.sleep(2000);
			System.out.println("Chatting ended");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}