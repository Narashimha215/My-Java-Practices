package com.kn.Aggregation;

public class Airline {
	String airlineName;
	Pilot pilot;
	public void operate()
	{
		System.out.println(this.airlineName+" Airline has Flying");
		pilot.fly();
	}
	public Airline(String airline, Pilot pilot) {
		this.airlineName = airline;
		this.pilot = pilot;
	}
}
