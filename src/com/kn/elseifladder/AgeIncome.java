package com.kn.elseifladder;

import java.util.Scanner;

public class AgeIncome
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age=");
		int n = scan.nextInt();
		System.out.println("Enter Income=");
		int i = scan.nextInt();
		if(n>=18)
		{
			if(18<=n && 39>=n && 50000<=i)
			{
				System.out.println("You qualified by loan");
				System.out.println("Your loan upto 50lacks");
			}
			else if(40<=n && 49>=n && 100000<=i)
			{
				System.out.println("You qualified by loan");
				System.out.println("Your loan upto 1crore");
			}
			else if(50<=n && 60>=n && 150000<=i)
			{
				System.out.println("You qualified by loan");
				System.out.println("Your loan upto 1.5crore");
			}
			else
			{
				System.out.println("Your not qualified by loan");
			}
		}
		else
		{
			System.out.println("Your not qualified by loan");
		}
		scan.close();
	}

}
