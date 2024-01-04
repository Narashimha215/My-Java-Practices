package com.kn.elseifladder;

import java.util.Scanner;

public class EmployeeBonus 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Experince=");
		int n = scan.nextInt();
		int isEligible = n;
		if(n>=3) 
		{
			System.out.println("Enter Employee rating=");
			int s = scan.nextInt();
			if(s==5)
			{
				System.out.println("your rating is Excelent");
				System.out.println("your eligible for 25% bpnus");
			}
			else if(s==4)
			{
				System.out.println("your rating is Good");
				System.out.println("your eligible for 20% bonus");
			}
			else if(s==3)
			{
				System.out.println("your rating is Average");
				System.out.println("your eligible for 15% bonus");
			}
			else if(s==2)
			{
				System.out.println("your rating is Poor");
				System.out.println("your eligible for 10% bonus");
			}
			else if(s==1)
			{
				System.out.println("your rating is bad");
				System.out.println("your Not eligible for driving license");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		else
		{
			System.out.println("your Not eligible for bonus");
		}
		scan.close();
	}
	static int isEligible(int n) 
	{
		return n;
	}
}