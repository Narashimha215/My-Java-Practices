package kn.com.ParentChildInheritance;

public class Parent
{
	String name = "Arjun";
	int age = 50;
	public Parent()
	{
		super();
		System.out.println("No argument constructor");
	}
	public Parent(String name, int age)
	{
		super();
		System.out.println("2 argument constructor");
		this.name = name;
		this.age = age;
	}
}