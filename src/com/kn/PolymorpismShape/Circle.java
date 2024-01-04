package com.kn.PolymorpismShape;

public class Circle extends Shape 
{
	public void draw()
	{
		System.out.println("Drawing Circle Shape");
	}
	public double calArea()
	{
		double r = 2.5;
		return Math.PI*r*r;
	}
}