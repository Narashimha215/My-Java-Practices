package com.kn.PolymorpismShape;

public class ShapeDemo {

	public static void main(String[] args) 
	{
		Shape sh = new Shape();
		Rectangle r = new Rectangle();
		sh = r;
		sh.draw();
		System.out.println(sh.calArea());
		Square s = new Square();
		sh = s;
		sh.draw();
		System.out.println(sh.calArea());
		Circle c = new Circle();
		sh = c;
		sh.draw();
		System.out.println(sh.calArea());
	}	
}