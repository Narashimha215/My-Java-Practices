package com.kodnest.Array;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number = ");
		int a = scan.nextInt();
		String b = Integer.toString(a);
		System.out.println("Enter number = ");
		int c = scan.nextInt();
		String d = Integer.toString(c);
		if(b.length()==d.length())
		{
			System.out.println("This is Anagram number");
		}
		else
		{
			System.out.println("This is Not Anagram number");
		}
		scan.close();
	}

}
