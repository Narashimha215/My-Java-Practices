package com.kodnest.day;

import java.util.Scanner;

public class Anagrams 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1 number = ");
		int a = scan.nextInt();
		String c =Integer.toString(a);
		System.out.println("Enter the 2 number = ");
		int b = scan.nextInt();
		String d =Integer.toString(b);
		if(c.length() == d.length())
		{
			System.out.println(a+" and "+b+" These are Anagram number");
		}
		else
		{
			System.out.println(a+" and "+b+" These are not Anagram number");
		}
		scan.close();
	}
}