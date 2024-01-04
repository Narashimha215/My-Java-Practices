package com.kn.Multithreading1;

public class Hospital {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		Treatment tom = new Treatment(h);
		Treatment jerry = new Treatment(h);
		Thread t1 = new Thread(tom);
		Thread t2 = new Thread(jerry);
		t1.setName("tom");
		t2.setName("jerry");
		t1.start();
		t2.start();
	}
}
//Output:
//	Treatment Started for jerry
//	Treatment Started for tom
//	Treatment In-progress for jerry
//	Treatment In-progress for tom
//	Treatment Completed for tom
//	Treatment Completed for jerry
