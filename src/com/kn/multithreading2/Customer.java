package com.kn.multithreading2;

public class Customer implements Runnable{
	PizzaHouse ph;
	int num=1;
	public Customer(PizzaHouse ph) {
		this.ph=ph;
	}
	public void run() {
		while(true) {
			ph.eat(num++);
		}
	}
}