package kn.com.MultilevelInheritance;

public class MultilevelDemo {

	public static void main(String[] args) 
	{
		Vehicle v1 = new Vehicle();
		v1.regNumber=1111;
		System.out.println("Registration Number = "+v1.regNumber);
		v1.move();
		Car c1 = new Car();
		c1.regNumber=2222;
		System.out.println("Registration Number = "+c1.regNumber);
		c1.move();
		Sedan s1 = new Sedan();
		s1.regNumber=3333;
		System.out.println("Registration Number = "+s1.regNumber);
		s1.move();
	}
}