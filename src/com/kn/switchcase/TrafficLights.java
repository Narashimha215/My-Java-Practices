package com.kn.switchcase;

import java.util.Scanner;

public class TrafficLights {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter color(red,green,yellow)=");
		String clr=scan.next();
		String isColor = clr;
		switch(clr)
		{
		case "red":
			System.out.println("You stop the vehicle");
			break;
		case "green":
			System.out.println("You move your vehicle");
			break;
		case "yellow":
			System.out.println("You go slow ");
			break;
		default:
			System.out.println("invalid color");
		}
		scan.close();
	}
	static String isColor(String clr)
	{
		return clr;
	}
}
