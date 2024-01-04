package com.kn.abstraction1;

public class CarDemo {

	public static void main(String[] args) 
	{
		ElctricCar ec = new ElctricCar();
		DieselCar dc = new DieselCar();
		PetrolCar pc = new PetrolCar();
		ec.start();
		ec.stop();
		ec.refuel();
		System.out.println("*********************");
		dc.start();
		dc.stop();
		dc.refuel();
		System.out.println("*********************");
		pc.start();
		pc.stop();
		pc.refuel();
		System.out.println("*********************");
	}
}