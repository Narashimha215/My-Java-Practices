package com.kn.multithreading.daemon;
public class SavingCod extends Thread{

	@Override
	public void run() {
		for(;;)//Infinite loop
		{
			System.out.println("Saving Code");
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}