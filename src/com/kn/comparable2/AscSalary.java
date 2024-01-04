package com.kn.comparable2;

public class AscSalary implements Comparable<AscSalary>{
	int id;
	String name;
	double salary;
	
	public AscSalary(int id,String name,double salary) {
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
		return "AscSalary [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int compareTo(AscSalary s) {
		if(this.salary > s.salary) {
			return 1;
		}
		else if(this.salary < s.salary) {
			return -1;
		}
		else {
			return 0;
		}
	}
}