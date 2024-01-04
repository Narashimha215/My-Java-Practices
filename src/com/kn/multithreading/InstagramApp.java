package com.kn.multithreading;

public class InstagramApp {

	public static void main(String[] args) 
	{
		System.out.println("Instagram Application Started");
		Chatting c = new Chatting();
		Reels r = new Reels();
		c.start();
		r.start();
		try {
			c.join();
			r.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Instagram Application has been terminated");
	}
}