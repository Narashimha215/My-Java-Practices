package com.kn.imp;
import java.util.Scanner;
public class FibonacciSeries 
{
	
	// Recursion Method
//	static int a=0,b=1,c;
//	static void printFib(int n)
//	{
//		if(n>0) {
//		c = a+b;
//		a=b;
//		b=c;
//		System.out.print(" "+c);
//		printFib(n-1);
//		}
//	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n = sc.nextInt();
//		System.out.print(a+" "+b);
//		printFib(n-2);
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=2;i<n;i++)
		{
			c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		sc.close();
	}
}