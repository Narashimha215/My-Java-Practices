package com.kn.comparable2;

public class AscName implements Comparable<AscName>{
	int id;
	String name;
	double salary;
	
	public AscName(int id,String name,double salary) {
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
		return "AscName [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int compareTo(AscName s) {
		if((this.name).compareTo(s.name) > 0) {
			return 1;
		}
		else if((this.name).compareTo(s.name) < 0) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
