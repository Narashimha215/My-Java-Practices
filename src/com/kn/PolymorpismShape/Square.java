package com.kn.PolymorpismShape;

public class Square extends Shape 
{
	public void draw()
	{
		System.out.println("Drawing Square Shape");
	}
	public double calArea()
	{
		double side = 5.5;
		return side * side;
	}
}