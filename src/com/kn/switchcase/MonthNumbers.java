package com.kn.switchcase;

import java.util.Scanner;

public class MonthNumbers 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month (1-12)=");
		int month = scan.nextInt();
		switch(month)
		{
		case 1:
			System.out.println("january month 31days");
			break;
		case 2:
			System.out.println("febraury month 28days");
			break;
		case 3:
			System.out.println("march month 31days");
			break;
		case 4:
			System.out.println("April month 30days");
			break;
		case 5:
			System.out.println("may month 31days");
			break;
		case 6:
			System.out.println("june month 30days");
			break;
		case 7:
			System.out.println("july month 31days");
			break;
		case 8:
			System.out.println("august month 31days");
			break;
		case 9:
			System.out.println("september month 30days");
			break;
		case 10:
			System.out.println("october month 31days");
			break;
		case 11:
			System.out.println("november month 30days");
			break;
		case 12:
			System.out.println("december month 31days");
			break;
		default:
			System.out.println("Invalid month");
		}
		scan.close();
	}
}
