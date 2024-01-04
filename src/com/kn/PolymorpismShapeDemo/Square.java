package com.kn.PolymorpismShapeDemo;

public class Square extends Shape {
	double side = 5.5;
	public double calArea()
	{
		return side * side;
	}
	public double calPerimeter()
	{
		return 4 * side;
	}
}
