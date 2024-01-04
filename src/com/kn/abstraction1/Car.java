package com.kn.abstraction1;

abstract public class Car 
{
	public void start()
	{
		System.out.println("Car has Started");
	}
	public void stop()
	{
		System.out.println("Car has Stoped");
	}
	abstract public void refuel();
}