package com.kodnest.day;

import java.util.Scanner;

public class DidvisibleBy4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = scan.nextInt();
		isDivisible(num);
		
		scan.close();
	}
	public static void isDivisible(int num)
	{
		if(num % 4==0)
		{
			System.out.println("This numbr is divisible by 4");
		}
		else
		{
			System.out.println("This numbr is not divisible by 4");
		}
	}
}