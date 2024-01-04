package com.kn.simpleif;

import java.util.Scanner;

public class Positivenum 
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
