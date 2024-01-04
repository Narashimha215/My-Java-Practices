package com.kn.Aggregation;

public class AggregatinDemo {

	public static void main(String[] args) 
	{
		Pilot pilot1 = new Pilot("John");
		Airline airline = new Airline("Emirates", pilot1);
		airline.operate();
		airline = null;
		System.out.println("-----> Airline has been shutdown !!");
		pilot1.fly();
	}
}