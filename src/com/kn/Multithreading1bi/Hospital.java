package com.kn.Multithreading1bi;

public class Hospital {
	String res1="doctor";
	String res2="bed";
	public void treatTom()
	{
		try {
			synchronized (res1) {
				System.out.println("Tom is using "+res1);
				Thread.sleep(2000);
				synchronized (res2) {
					System.out.println("Tom is using "+res2);
					Thread.sleep(2000);
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	public void treatJerry()
	{
		try {
			synchronized (res2) {
				System.out.println("Jerry is using "+res2);
				Thread.sleep(2000);
				synchronized (res1) {
					System.out.println("Jerry is using "+res1);
					Thread.sleep(2000);
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
