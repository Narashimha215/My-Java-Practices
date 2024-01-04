package com.kn.comparable2;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	
	public Employee(int id,String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getPercentage() {
		return salary;
	}

	public void setPercentage(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int compareTo(Employee s) {
		if(this.id > s.id) {
			return 1;
		}
		else if(this.id < s.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
}