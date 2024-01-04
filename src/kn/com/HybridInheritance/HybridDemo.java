package kn.com.HybridInheritance;

public class HybridDemo {

	public static void main(String[] args) 
	{
		Person p = new Person();
		p.name = "Narashimha";
		System.out.println("Person Name = "+p.name);
				
		EngineeringStudent e = new EngineeringStudent();
		e.name = "Malikarjuna";
		System.out.println("EngineeringStudent Name = "+e.name);
		
		MedicalStudent m = new MedicalStudent();
		m.name = "Subbu";
		System.out.println("MedicalStudent Name = "+m.name);
		
		JavaTrainer t1 = new JavaTrainer();
		t1.name = "Ganesh";
		System.out.println("JavaTrainer Name = "+t1.name);
		
		SQLTrainer s1 = new SQLTrainer();
		s1.name = "Siva";
		System.out.println("SQLTrainer Name = "+s1.name);
	}
}