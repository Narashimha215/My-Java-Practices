package com.kn.Topimpprgms;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1= ");
		int a = sc.nextInt();
		System.out.print("Enter the number 2= ");
		int b = sc.nextInt();
		int count;
		System.out.println("Enter the range to print ("+a+" to "+b+")");
		for(int i=a;i<=b;i++)
		{
			count = 0;
			for(int j=2; j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}