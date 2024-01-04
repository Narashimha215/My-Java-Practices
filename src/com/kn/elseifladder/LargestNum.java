package com.kn.elseifladder;

import java.util.Scanner;

public class LargestNum 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many values=");
		int n = scan.nextInt();
		int isEligible = n;
		if(n==3) 
		{
			System.out.println("Enter A value=");
			int a = scan.nextInt();
			System.out.println("Enter A value=");
			int b = scan.nextInt();
			System.out.println("Enter A value=");
			int c = scan.nextInt();
			if(a==b && a==c)
			{
				System.out.println("All are equal values");
			}
			else if(a<=b && c<=b)
			{
				System.out.println("b is largest number");
			}
			else if(a>=b && c<=a)
			{
				System.out.println("a is largest number");
			}
			else
			{
				System.out.println("c is largest number");
			}
		}
		else
		{
			System.out.println("Invalid");
		}
		scan.close();
	}
	static int isEligible(int n) 
	{
		return n;
	}
}