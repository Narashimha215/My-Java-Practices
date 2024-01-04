package com.kn.Multithreading1bi;
public class HospitalDemo {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		Tom t = new Tom(h);
		Jerry j = new Jerry(h);
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(j);
		t1.start();
		t2.start();
	}
}