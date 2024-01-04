package com.kn.comparable;

@SuppressWarnings("rawtypes")
public class Student implements Comparable{
	int id;
	String name;
	double percentage;
	
	public Student(int id,String name,double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
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
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

	@Override
	public int compareTo(Object o) {
		if(this.id > ((Student)(o)).id) {
			return 1;
		}
		else if(this.id < ((Student)(o)).id) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
