package com.kn.bean;

public class Cars {
	int modelNumber;
	String company;
	double price;
	public Cars() {
		super();
	}
	public Cars(int modelNumber, String company, double price) {
		this.modelNumber = modelNumber;
		this.company = company;
		this.price = price;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cars [modelNumber=" + modelNumber + ", company=" + company + ", price=" + price + "]";
	}
}
