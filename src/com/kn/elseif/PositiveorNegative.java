package com.kn.elseif;

import java.util.Scanner;

public class PositiveorNegative 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=scan.nextInt();
		boolean flag = isPositiveNumber(num);
		if(flag == true)
		{
			System.out.println("The given number "+num+" is POSITIVE");
		}
		else
		{
			System.out.println("The given number "+num+" is NEGATIVE");
		}
		scan.close();
	}
	static boolean isPositiveNumber(int num) 
	{
		if(num>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
