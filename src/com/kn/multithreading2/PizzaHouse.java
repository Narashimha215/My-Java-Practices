package com.kn.multithreading2;

public class PizzaHouse {
	int token;
	boolean isAvailable = false;
	public synchronized void bake(int num) {
		try{
			
			if(isAvailable==false) {
				token=num;
				System.out.println("baker is baking for "+token);
				isAvailable=true;
				notify();
			}else {
				wait();
			}
			}catch(InterruptedException e) {
				e.printStackTrace();
		}
	}
	public synchronized void eat(int num) {
			if(isAvailable==false) {
				System.out.println("baker is eating for "+token);
				isAvailable=true;
				notify();
			}else {
				try{
					wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}