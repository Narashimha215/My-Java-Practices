package com.kn.entities;

public class Mobile {
	String name;
	String RAM;
	double cost;
	public Mobile() {
	}
	public Mobile(String name, String rAM, double cost) {
		this.name = name;
		RAM = rAM;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", RAM=" + RAM + ", cost=" + cost + "]";
	}
}
