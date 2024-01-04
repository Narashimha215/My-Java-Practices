package kn.com.ParentChildInheritance;

public class MultipleDemo 
{
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		System.out.println("Name = "+p.name);
		System.out.println("Age = "+p.age);
		Parent p1 = new Parent("Siva",56);
		System.out.println("Name = "+p1.name);
		System.out.println("Age = "+p1.age);
		Child c=new Child();
		System.out.println("Name = "+c.name);
		System.out.println("Age = "+c.age);
		Child c1 = new Child("Ganesh",23);
		System.out.println("Name = "+c1.name);
		System.out.println("Age = "+c1.age);
	}
}