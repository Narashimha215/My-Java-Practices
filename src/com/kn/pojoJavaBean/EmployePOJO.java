package com.kn.pojoJavaBean;

public class EmployePOJO {
	private int id;
	public String name;
	protected double salary;
	
	public EmployePOJO(int id) {
		this.id = id;
	}

	public EmployePOJO() {
		System.out.println("No arg constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}