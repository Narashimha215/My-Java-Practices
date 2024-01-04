package com.kn.Topimpprgms;

import java.util.Scanner;

public class FactorialMethod {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int a = sc.nextInt();
		System.out.println("The factorial of "+a+" is = "+printFact(a));
		sc.close();
	}
	private static int printFact(int a) 
	{
		int f = 1;
		for(int i = a;i>0;i--)
		{
			f = f*i;
		}
		return f;
	}
}