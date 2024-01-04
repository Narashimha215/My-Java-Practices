package com.kn.simpleif;

import java.util.Scanner;

public class Capital 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the letter=");
		char str = scan.next().charAt(0);
		boolean flag = isUpperCase(str);
		if(flag)
		{
			System.out.println("Capital letter");
		}
		scan.close();
	}
	static boolean isUpperCase(char str) 
	{
		if(Character.isUpperCase(str))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
