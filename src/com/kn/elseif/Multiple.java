package com.kn.elseif;

import java.util.Scanner;

public class Multiple 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number=");
		int n = scan.nextInt();
		boolean b = isMultiple(n);
		if(b == true)
		{
			System.out.println(n+"is multiply of 10");
		}
		else
		{
			System.out.println(n+"is not multiply of 10");
		}
		scan.close();
	}
	static boolean isMultiple(int n) 
	{
		if(n%10==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
