package com.kn.Project;
class Student
{
	String name;
	int age;
	public Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	void display()
	{
		System.out.println("Name = "+name+", Age = "+age);
	}
}
public class ArrayOfObjects
{
	public static void main(String args[])
	{
		Student[] students = new Student[3];
		students[0] = new Student("Narashimha",22);
		students[1] = new Student("Reddy",20);
		students[2] = new Student("Ganesh",23);
		
		for(Student student:students)
		{
			student.display();
		}
	}
}