package com.kn.entities;

public class Person {
	String name;
	int age;
	Mobile mobile;
	
	public Person() {
	}

	public Person(String name, int age, Mobile mobile) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", mobile=" + mobile + "]";
	}
}
