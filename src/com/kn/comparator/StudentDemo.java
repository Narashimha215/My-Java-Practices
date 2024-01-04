package com.kn.comparator;

import java.util.*;
// student and studentDemo one pair(only this two)
public class StudentDemo implements Comparator<Student> {

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
		// SortStudentById s = new SortStudentById();
		// Collections.sort(Studentlist,s);

		// Sorting based on Name
		Collections.sort(Studentlist, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		// Sorting based on ID

		Collections.sort(Studentlist, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getId() > s2.getId()) {
					return 1;
				} else if (s1.getId() < s2.getId()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		System.out.println("After sorting = ");
		System.out.println(Studentlist);
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}