package com.kn.multithreading;

public class Reels extends Thread
{
	@Override
	public void run() {
		try {
			System.out.println("Creating Reels");
			Thread.sleep(2000);
			System.out.println("Uploding the Reels");
			Thread.sleep(2000);
			System.out.println("Sharing the Reels");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}