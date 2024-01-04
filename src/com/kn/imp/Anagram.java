package com.kn.imp;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		String a = Integer.toString(n);
		System.out.println("Enter the number = ");
		int m = sc.nextInt();
		String b = Integer.toString(m);
		if(a.length() == b.length())
		{
			System.out.println("This is Anagram");
		}
		else
		{
			System.out.println("This is not Anagram");
		}
		sc.close();
	}
}