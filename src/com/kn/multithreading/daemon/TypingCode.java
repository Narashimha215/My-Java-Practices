package com.kn.multithreading.daemon;

public class TypingCode extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("Typing Code");
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}