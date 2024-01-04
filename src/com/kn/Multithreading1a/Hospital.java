package com.kn.Multithreading1a;

public class Hospital {

	public static void main(String[] args) {
		Treatment tre = new Treatment();
		Thread t1 = new Thread(tre);
		Thread t2 = new Thread(tre);
		t1.setName("tom");
		t2.setName("jerry");
		t1.start();
		t2.start();
	}
}
//output:
//	Treatment Started for tom
//	Treatment In-progress for tom
//	Treatment Completed for tom
//	Treatment Started for jerry
//	Treatment In-progress for jerry
//	Treatment Completed for jerry

