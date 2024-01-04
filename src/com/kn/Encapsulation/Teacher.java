package com.kn.Encapsulation;

public class Teacher {

	public static void main(String[] args) {
		Student s = new Student();
		s.setRoolNum(101);
		s.getRoolNum();
		s.setName("Ram");	
		s.getName();
		s.setAttended(true);
		s.isAttended();
	}
}