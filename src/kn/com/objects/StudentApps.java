package kn.com.objects;

import java.util.Scanner;

public class StudentApps {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students objects created = ");
		Student srr[] = new Student[sc.nextInt()];
		for(int i=0;i<srr.length;i++)
		{
			System.out.print("Enter ID for student "+(i+1)+" = ");
			int id = sc.nextInt();
			System.out.print("Enter Name for student "+(i+1)+" = ");
			String name = sc.next();
			System.out.print("Enter Marks for student "+(i+1)+" = ");
			int marks = sc.nextInt();
			Student s= new Student(id,name,marks);
			srr[i] = s;
		}
		for(Student s:srr) 
		{
		System.out.println("Id = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
		}	
		sc.close();
	}
}