package com.kn.PolymorpismShapeDemo;

public class ShapeDemo2 {

	public static void main(String[] args) 
	{
		Geometry g= new Geometry();
		Circle c = new Circle();
		Square s = new Square();
		Rectangle r = new Rectangle();
		g.doActivity(c);
		g.doActivity(s);
		g.doActivity(r);
	}
}