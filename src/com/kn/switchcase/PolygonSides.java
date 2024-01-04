package com.kn.switchcase;

import java.util.Scanner;

public class PolygonSides 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value=");
		int a= scan.nextInt();
		switch(a)
		{
		case 3:
		    System.out.println("This is Triangle");
			break;
		case 4:
		    System.out.println("This is square");
		    break;
		case 5:
		    System.out.println("This is Pentagon");
			break;
		case 6:
		    System.out.println("This is Hexagon");
			break;
		case 7:
		    System.out.println("This is Heptagon");
			break;
		case 8:
		    System.out.println("This is Octagon");
			break;
		case 9:
		    System.out.println("This is Nonagon");
		    break;
		case 10:
		    System.out.println("This is Decogon");
			break;
		default:
			System.out.println("Invalid");
		}
		scan.close();
	}

}
