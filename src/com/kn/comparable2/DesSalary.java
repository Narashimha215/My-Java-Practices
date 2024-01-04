package com.kn.comparable2;

public class DesSalary implements Comparable<DesSalary>{
	int id;
	String name;
	double salary;
	
	public DesSalary(int id,String name,double salary) {
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
		return "DesSalary [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int compareTo(DesSalary s) {
		if(this.salary < s.salary) {
			return 1;
		}
		else if(this.salary > s.salary) {
			return -1;
		}
		else {
			return 0;
		}
	}
}