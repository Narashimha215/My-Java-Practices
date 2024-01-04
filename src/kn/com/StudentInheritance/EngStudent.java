package kn.com.StudentInheritance;

public class EngStudent extends Student
{
	String branch;
	int sem;
	public EngStudent(String name, int age,String branch, int sem)
	{
		super(name,age);
		this.branch = branch;
		this.sem = sem;
	}
	public EngStudent(String name, int age,String branch)
	{
		super(name,age);
		this.branch = branch;
	}
	public EngStudent(String name, int age,int sem)
	{
		super(name,age);
		this.sem = sem;
	}
	public EngStudent(String name, int age)
	{
		super(name,age);
	}
}