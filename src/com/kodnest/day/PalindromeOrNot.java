package com.kodnest.day;

import java.util.Scanner;

public class PalindromeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = scan.nextInt();
		if(isPolindrome(num)) 
		{
			System.out.println("This is polindrome number");
		}
		else
		{
			System.out.println("This is not polindrome number");
		}
		scan.close();
	}
	static boolean isPolindrome(int num) 
	{
		int originalNumber = num;
		int reverse = 0;
		while(num!=0)
		{
			int remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num/10;
		}
		return originalNumber == reverse;
	}
}