package com.kn.imp;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year = ");
		int n = sc.nextInt();
		if(isLeapYear(n))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap year");
		}
		sc.close();
	}

	private static boolean isLeapYear(int n) 
	{
		if((n%4 == 0 && n % 100 != 0) || (n%400 == 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}