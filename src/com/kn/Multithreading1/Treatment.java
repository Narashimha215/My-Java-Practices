package com.kn.Multithreading1;

public class Treatment implements Runnable{
	Hospital h;

	@Override
	synchronized public void run() {
		try {
			System.out.println("Treatment Started for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment In-progress for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment Completed for "+Thread.currentThread().getName());
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public Treatment(Hospital h) {
		this.h=h;
	}
}