package com.kn.simpleif;

import java.util.Scanner;

public class Discount 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount=");
		int num = scan.nextInt();
		boolean b = isVoting(num);
		if(b==true)
		{
			System.out.println("Discount Applicable");
		}
		scan.close();
	}
	static boolean isVoting(int num) 
	{
		if(num >=100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
