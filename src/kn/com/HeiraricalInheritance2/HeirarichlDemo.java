package kn.com.HeiraricalInheritance2;

public class HeirarichlDemo {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		System.out.println("This is Employee...........");
		e1.name = "Siva";
		System.out.println("Name = "+e1.name);
		e1.salary = 100000;
		System.out.println("Salary = "+e1.salary);
		System.out.println();
		
		Developer d1 = new Developer();
		System.out.println("This is Developer...........");
		d1.name = "Narashimha";
		System.out.println("Name = "+d1.name);
		d1.salary = 600000;
		System.out.println("Salary = "+d1.salary);
		System.out.println();
		
		TestEngineer t1 = new TestEngineer();
		System.out.println("This is TestEngineer...........");
		t1.name = "Ganesh";
		System.out.println("Name = "+t1.name);
		t1.salary = 400000;
		System.out.println("Salary = "+t1.salary);
		System.out.println();
		
		Manager m1 = new Manager();
		System.out.println("This is Manager...........");
		m1.name = "Sai";
		System.out.println("Name = "+m1.name);
		m1.salary = 300000;
		System.out.println("Salary = "+m1.salary);
		System.out.println();
		
		TeamLead v1 = new TeamLead();
		System.out.println("This is TeamLead...........");
		v1.name = "malikarjuna";
		System.out.println("Name = "+v1.name);
		v1.salary = 200000;
		System.out.println("Salary = "+v1.salary);
	}	
}