package com.kn.elseifladder;

import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number=");
		int n = scan.nextInt();
		if(n%2==0)
		{
			if(n%5==0)
			{
				System.out.println("Divisible by 2 and 5");
			}
			else
			{
				System.out.println("Divisible by 2 only");
			}
		}
		else
		{
			System.out.println("Not divisible by 2 and 5");
		}
		scan.close();
	}

}
