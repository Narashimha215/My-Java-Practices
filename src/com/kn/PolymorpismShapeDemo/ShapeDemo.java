package com.kn.PolymorpismShapeDemo;

public class ShapeDemo {

	public static void main(String[] args) 
	{
		// create object of Parent Class
		Shape sh; // or Shape sh = new Shape();
		// Create object child class & Assign it to parent reference
		// Upcasting Circle to Shape
		sh = new Circle();
		// Calling methods using parent reference
		sh.draw();
		System.out.println("Area of Circle = "+sh.calArea());
		// Error ==> Child specific methods cann't be called using parent reference
        // System.out.println(sh.calPerimeter());
		// DownCasting to Circle class to call child specific methods 
		System.out.println("Perimeter of circle = "+((Circle)(sh)).calPerimeter());
		
		// Create object child class
//		Circle c = new Circle();
//		c.draw();
//		System.out.println(c.calArea());
//		System.out.println(c.calPerimeter());
	}	
}