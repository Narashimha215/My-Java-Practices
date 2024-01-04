package com.kn.StringDemo;

import java.util.Scanner;

public class AnagramDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string1 = ");
		String a = scan.nextLine();
		System.out.print("Enter the string2 = ");
		String b = scan.nextLine();
		AnagramString anagram = new AnagramString();
		boolean isAnagram = anagram.isAnagram(a, b);
		if(isAnagram)
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