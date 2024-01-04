package com.kn.StringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string1 = ");
		String a = scan.nextLine();
		char[] arr = a.toCharArray();
		System.out.print("Enter the string2 = ");
		String b = scan.nextLine();
		char[] brr = b.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(brr);
		boolean result = Arrays.equals(arr, brr);
		if(result)
		{
			System.out.println("This is Anagram.");
		}
		else
		{
			System.out.println("This is not Anagram.");
		}
		scan.close();
	}
}