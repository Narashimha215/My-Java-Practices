package com.kn.PolymorpismShape;

public class Rectangle extends Shape 
{
	public void draw()
	{
		System.out.println("Drawing Rectangle Shape");
	}
	public double calArea()
	{
		double l=5.5, b= 10.5;
		return l * b;
	}
}