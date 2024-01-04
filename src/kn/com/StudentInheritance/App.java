package kn.com.StudentInheritance;

public class App {

	public static void main(String[] args) 
	{
		Student s = new Student("Narashimha",22);
		System.out.println("Name = "+s.name);
		System.out.println("Age = "+s.age);
		System.out.println();
		EngStudent e= new EngStudent("Ganesh",22,"ECE",4);
		System.out.println("Name = "+e.name);
		System.out.println("Age = "+e.age);
		System.out.println("Branch = "+e.branch);
		System.out.println("Sem = "+e.sem);
		System.out.println();
		EngStudent e1= new EngStudent("Siva",26,"Mech");
		System.out.println("Name = "+e1.name);
		System.out.println("Age = "+e1.age);
		System.out.println("Branch = "+e1.branch);
		System.out.println();
		EngStudent e2= new EngStudent("Mali",27,4);
		System.out.println("Name = "+e2.name);
		System.out.println("Age = "+e2.age);
		System.out.println("Sem = "+e2.sem);
		System.out.println();
		EngStudent e3= new EngStudent("Subu",28);
		System.out.println("Name = "+e3.name);
		System.out.println("Age = "+e3.age);
	}
}