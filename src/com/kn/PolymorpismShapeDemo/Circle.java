package com.kn.PolymorpismShapeDemo;

public class Circle extends Shape
{
	double radius = 5.5;
	public double calArea()
	{
		return Math.PI*radius*radius;
	}
	public double calPerimeter()
	{
		return 2 * Math.PI*radius;
	}
}
