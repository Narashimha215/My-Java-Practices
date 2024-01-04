package kn.com.Inheritance2;

public class RobosDemo {

	public static void main(String[] args) 
	{
		ChefRobo chef = new ChefRobo("Chitti","2.0v");
		Robo r = new Robo();
		System.out.println("Name = "+chef.name);	
		System.out.println("Type = "+chef.type);
		System.out.print("Chef");
		r.walk();
		System.out.print("Chef");
		r.talk();
		System.out.print("Chef");
		r.charge();
		chef.cook();
		System.out.println();
		
		DriverRobo d = new DriverRobo("Bhasa","drive");
		System.out.println("Name = "+d.name);	
		System.out.println("Type = "+d.type);	
		System.out.print("Driver");
		r.walk();
		System.out.print("Driver");
		r.talk();
		System.out.print("Driver");
		r.charge();
		d.cook();
		System.out.println();
		
		TeacherRobo t = new TeacherRobo("Reddy","Teaching");
		System.out.println("Name = "+t.name);	
		System.out.println("Type = "+t.type);	
		System.out.print("Teacher");
		r.walk();
		System.out.print("Teacher");
		r.talk();
		System.out.print("Teacher");
		r.charge();
		t.cook();
		System.out.println();
	}
}