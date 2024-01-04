package com.kn.Topimpprgms;

import java.util.Scanner;

public class SwapWithout3var 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 num = ");
		int a = sc.nextInt();
		System.out.println("Enter the 2 num = ");
		int b= sc.nextInt();
		System.out.println("Before Swaping A ="+a+" and B = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swaping A ="+a+" and B = "+b);
		sc.close();
	}
}