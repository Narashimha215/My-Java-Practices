package com.kn.pojoJavaBean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentJavaBean implements Serializable{
	private int id;
	private String name;
	private double salary;
	
	public StudentJavaBean() {
		
	}
	public StudentJavaBean(int id, String name) {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}