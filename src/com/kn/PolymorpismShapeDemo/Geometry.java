package com.kn.PolymorpismShapeDemo;

public class Geometry 
{
	public void doActivity(Shape sh)
	{
		sh.draw();
		System.out.println(sh.calArea());
		if(sh instanceof Circle)
		{
			System.out.println("Perimeter of circle = "+((Circle)(sh)).calPerimeter());
		}
		else if(sh instanceof Square)
		{
			System.out.println("Perimeter of Square = "+((Square)(sh)).calPerimeter());
		}
		else
		{
			System.out.println("Perimeter of Rectangle = "+((Rectangle)(sh)).calPerimeter());
		}
		System.out.println("==================================================");
	}
}
