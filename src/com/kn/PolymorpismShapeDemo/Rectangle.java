package com.kn.PolymorpismShapeDemo;

public class Rectangle extends Shape 
{
	double length = 5.5;
	double width =10.5;
	public double calArea()
	{
		return length * width;
	}
	public double calPerimeter()
	{
		return 2 *length * width;
	}
}
