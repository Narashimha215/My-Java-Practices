package com.kn.switchcase;

import java.util.Scanner;

public class Weeks 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day(0-6)=");
		int day = scan.nextInt();
		switch(day)
		{
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
		    break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("This is not weekday");
		}
		scan.close();
	}

}
