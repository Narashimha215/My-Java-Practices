package com.kn.Topimpprgms;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int a = sc.nextInt();
		sc.close();
		int i=2;
		for(;i<10;i++)
		{
			if(a%i==0 && a!=i)
			{
				System.out.println("This is not prime");
				break;
			}
		}
		if(i==10)
		{
			System.out.println("This is prime");
		}
	}
}