package com.kn.staticandInstance;

public class Programe 
{
	// Static variable
	static int x,y;
	
	// Static block
	static 
	{
		System.out.println("Static block");
		x= 10;
		y= 20;
	}
	
	// Static Method
	static void disp1()
	{
		System.out.println("Static Method");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
	// Instance Variable
	int a,b;
	{
		// Instance Block
		System.out.println("Instance Block");
		a = 11;
		b = 22;
		x = 100;
		y = 200;
	}
	
	// Instance Method
	public void disp2()
	{
		System.out.println("Instance method display2()");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
	//  Constructor
	public Programe()
	{
		System.out.println("Constructor called");
	}
}