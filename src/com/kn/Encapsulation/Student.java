package com.kn.Encapsulation;

public class Student {
	int roolNum;
	String name;
	boolean isAttended;
	public int getRoolNum() {
		return roolNum;
	}
	public void setRoolNum(int roolNum) {
		this.roolNum = roolNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAttended(boolean flag) {
		if(!isAttended) {
			isAttended=true;
		}
		System.out.println("Teacher attended attendance");
	}
	public boolean isAttended() {
		System.out.println("Student attended");
		return isAttended;
	}
}