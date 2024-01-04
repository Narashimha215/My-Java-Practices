package com.kn.multithreading2;

public class PizzaHouseDemo {

	public static void main(String[] args) {
		PizzaHouse ph = new PizzaHouse();
		Baker baker = new Baker(ph);
		Customer customer = new Customer(ph);
		Thread t1 = new Thread(baker);
		Thread t2 = new Thread(customer);
		t1.start();
		t2.start();
	}
}