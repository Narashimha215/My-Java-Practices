package com.kn.Topimpprgms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int a = sc.nextInt();
		int f=1;
		for(int i = a;i>0;i--)
		{
			f = f*i;
		}
		System.out.println("The factorial of "+a+" is = "+f);
		sc.close();
	}
}