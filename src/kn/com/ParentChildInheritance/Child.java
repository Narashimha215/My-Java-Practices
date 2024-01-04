package kn.com.ParentChildInheritance;

public class Child extends Parent
{
	String name = "Narashimha";
	int age = 22;
	public Child()
	{
		super();
		System.out.println("No argument constructor");
	}
	public Child(String name, int age)
	{
		super();
		System.out.println("2 argument constructor");
		this.name = name;
		this.age = age;
	}
}