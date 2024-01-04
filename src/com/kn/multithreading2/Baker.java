package com.kn.multithreading2;

public class Baker implements Runnable{
	PizzaHouse ph;
	int num=1;
	public Baker(PizzaHouse ph) {
		this.ph=ph;
	}
	public void run() {
		while(true) {
			ph.bake(num++);
		}
	}
}