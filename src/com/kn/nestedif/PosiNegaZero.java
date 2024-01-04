package com.kn.nestedif;

import java.util.Scanner;

public class PosiNegaZero {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number=");
		int n=scan.nextInt();
		if(n==0)
		{
			System.out.println("This is Zero");
		}
		else if(n>0)
		{
			System.out.println("This is positive number");
		}
		else 
		{ 
			System.out.println("This is negative number");
		}
		scan.close();
	}
}
