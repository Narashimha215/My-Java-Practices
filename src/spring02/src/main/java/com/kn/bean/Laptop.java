package com.kn.bean;

public class Laptop {
	int serialNumber;
	String manufacturer;
	double cost;
	public Laptop() {	
		
	}
	public Laptop(int serialNumber, String manufacturer, double cost) {
		this.serialNumber = serialNumber;
		this.manufacturer = manufacturer;
		this.cost = cost;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [serialNumber=" + serialNumber + ", manufacturer=" + manufacturer + ", cost=" + cost + "]";
	}
}
