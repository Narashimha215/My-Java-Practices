package com.kn.comparable2;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee s1 = new Employee(11, "ABC", 80000);
		Employee s2 = new Employee(33, "PQR", 78000);
		Employee s3 = new Employee(22, "XYZ", 98000);
		ArrayList<Employee> Employeelist = new ArrayList<>();
		Employeelist.add(s1);
		Employeelist.add(s2);
		Employeelist.add(s3);
		Collections.sort(Employeelist);
		System.out.println("Ascending ID= ");
		System.out.println(Employeelist);

		AscName n1 = new AscName(11, "ABC", 80000);
		AscName n2 = new AscName(33, "PQR", 78000);
		AscName n3 = new AscName(22, "XYZ", 98000);
		ArrayList<AscName> AscNamelist = new ArrayList<>();
		AscNamelist.add(n1);
		AscNamelist.add(n2);
		AscNamelist.add(n3);
		Collections.sort(AscNamelist);
		System.out.println("Ascending name= ");
		System.out.println(AscNamelist);
		
		AscSalary a1 = new AscSalary(11, "ABC", 80000);
		AscSalary a2 = new AscSalary(33, "XYZ", 78000);
		AscSalary a3 = new AscSalary(22, "PQR", 98000);
		ArrayList<AscSalary> AscSalarylist = new ArrayList<>();
		AscSalarylist.add(a1);
		AscSalarylist.add(a2);
		AscSalarylist.add(a3);
		Collections.sort(AscSalarylist);
		System.out.println("Ascending salary= ");
		System.out.println(AscSalarylist);
		
		Descending s4 = new Descending(11, "ABC", 80000);
		Descending s5 = new Descending(33, "PQR", 78000);
		Descending s6 = new Descending(22, "XYZ", 98000);
		ArrayList<Descending> Descendinglist = new ArrayList<>();
		Descendinglist.add(s4);
		Descendinglist.add(s5);
		Descendinglist.add(s6);
		Collections.sort(Descendinglist);
		System.out.println("Descending Id= ");
		System.out.println(Descendinglist);
		
		DesName n4 = new DesName(11, "ABC", 80000);
		DesName n5 = new DesName(33, "PQR", 78000);
		DesName n6 = new DesName(22, "XYZ", 98000);
		ArrayList<DesName> DesNamelist = new ArrayList<>();
		DesNamelist.add(n4);
		DesNamelist.add(n5);
		DesNamelist.add(n6);
		Collections.sort(DesNamelist);
		System.out.println("Descending name= ");
		System.out.println(DesNamelist);

		DesSalary a4 = new DesSalary(11, "ABC", 80000);
		DesSalary a5 = new DesSalary(33, "PQR", 78000);
		DesSalary a6 = new DesSalary(22, "XYZ", 98000);
		ArrayList<DesSalary> DesSalarylist = new ArrayList<>();
		DesSalarylist.add(a4);
		DesSalarylist.add(a5);
		DesSalarylist.add(a6);
		Collections.sort(DesSalarylist);
		System.out.println("Descending salary= ");
		System.out.println(DesSalarylist);
	}
}