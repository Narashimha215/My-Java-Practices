package com.kn.complexObjects;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student(11, "ABC", 80.40);
		Student s2 = new Student(33, "PQR", 78.40);
		Student s3 = new Student(22, "XYZ", 98.40);
		String str = new String("Dummy String");
		System.out.println(str.toString());
		System.out.println(s1);
		System.out.println(s2.toString());
		System.out.println(s3);
//		Dummy String
//		Student [id=11, name=ABC, percentage=80.4]
//		Student [id=33, name=PQR, percentage=78.4]
//		Student [id=22, name=XYZ, percentage=98.4]
	}
}