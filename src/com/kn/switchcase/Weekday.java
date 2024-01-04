package com.kn.switchcase;

import java.util.Scanner;

public class Weekday 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day(0-5)=");
		int day = scan.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("Monday");
		    System.out.println("This is weekday");
			break;
		case 2:
			System.out.println("Tuesday");
		    System.out.println("This is weekday");
			break;
		case 3:
			System.out.println("wednesday");
		    System.out.println("This is weekday");
			break;
		case 4:
			System.out.println("Thursday");
		    System.out.println("This is weekday");
			break;
		case 5:
			System.out.println("Friday");
		    System.out.println("This is weekday");
		    break;
		default:
			System.out.println("This is not weekday");
		}
		scan.close();
	}
}
