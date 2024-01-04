package com.kn.elseifladder;

import java.util.Scanner;

public class DrivingLicense 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age=");
		int n = scan.nextInt();
		int isEligible = n;
		if(n>=18) 
		{
			System.out.println("Enter vision score=");
			int s = scan.nextInt();
			if(s==5)
			{
				System.out.println("your credit score is Excelent");
				System.out.println("your eligible for driving license");
			}
			else if(s==4)
			{
				System.out.println("your credit score is GoOd");
				System.out.println("your eligible for driving license");
			}
			else if(s==3)
			{
				System.out.println("your credit score is Average");
				System.out.println("your eligible for driving license");
			}
			else if(s==2)
			{
				System.out.println("your credit score is Poor");
				System.out.println("your eligible for driving license");
			}
			else if(s==1)
			{
				System.out.println("your credit score is bad");
				System.out.println("your Not eligible for driving license");
			}
			else
			{
				System.out.println("your Not eligible for driving license");
			}
		}
		else
		{
			System.out.println("your Not eligible for driving license");
		}
		scan.close();
	}
	static int isEligible(int n) 
	{
		return n;
	}
}

