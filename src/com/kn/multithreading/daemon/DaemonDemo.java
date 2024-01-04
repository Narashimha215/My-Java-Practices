package com.kn.multithreading.daemon;

public class DaemonDemo {

	public static void main(String[] args) {
		//Instantiate thread objects
		TypingCode t1 = new TypingCode();
		SavingCod t2 = new SavingCod();
		CompilingCode t3 = new CompilingCode();
		
		// Set thread as daemon thread
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		// Start all threads
		t1.start();
		t2.start();
		t3.start();
	}

}
