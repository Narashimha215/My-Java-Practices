package com.kn.multithreading.daemon;
public class CompilingCode extends Thread{

	@Override
	public void run() {
		for(;;)//Infinite loop
		{
			System.out.println("Compiling Code");
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}