package kn.com.Inheritance2;

public class ChefRobo {
	
	 String type;
	 String name;
	 
	public void cook()
	{
		System.out.println("ChefRobo is cooking....");
	}
	public ChefRobo(String name,String type)
	{
		this.name=name;
		this.type=type;
	}
}
