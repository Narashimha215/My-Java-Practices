package com.kn.elseifladder;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year=");
		int year = scan.nextInt();
		boolean flag = isLeapyear(year);
		if(flag == true)
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is not leap year");
		}
		scan.close();
	}
	static boolean isLeapyear(int year)
	{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return true;
			}
		}
		else
		{
			return false;
		}
	}
}
