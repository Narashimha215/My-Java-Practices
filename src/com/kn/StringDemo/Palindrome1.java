package com.kn.StringDemo;

import java.util.Scanner;

public class Palindrome1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=arr.length-1;i>=0;i--)
		{
			sb.append(arr[i]);
		}
		String sb1 = sb.toString();
		if(str.equals(sb1))
		{
			System.out.println("This is Polindrome");
		}
		else
		{
			System.out.println("This is Not Polindrome");
		}
		scan.close();
	}
}