package com.kn.comparable1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student(11, "ABC", 80.40);
		Student s2 = new Student(33, "PQR", 78.40);
		Student s3 = new Student(22, "XYZ", 98.40);
		ArrayList<Student> Studentlist = new ArrayList<>();
		Studentlist.add(s1);
		Studentlist.add(s2);
		Studentlist.add(s3);
		System.out.println("Before sorting = ");
		System.out.println(Studentlist);
		Collections.sort(Studentlist);
		System.out.println("After sorting = ");
		System.out.println(Studentlist);
	}
}