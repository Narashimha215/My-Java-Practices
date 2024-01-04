package com.kn.comparable2;

public class DesName implements Comparable<DesName>{
	int id;
	String name;
	double salary;
	
	public DesName(int id,String name,double salary) {
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
		return "DesName [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int compareTo(DesName s) {
		if((this.name).compareTo(s.name) < 0) {
			return 1;
		}
		else if((this.name).compareTo(s.name) > 0) {
			return -1;
		}
		else {
			return 0;
		}
	}
}