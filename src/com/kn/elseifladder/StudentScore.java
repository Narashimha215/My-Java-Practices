package com.kn.elseifladder;

import java.util.Scanner;

public class StudentScore 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter passed tests=");
		int n = scan.nextInt();
		int isEligible = n;
		if(n==3) 
		{
			System.out.println("Enter student score from sub1=");
			int a = scan.nextInt();
			System.out.println("Enter student score from sub1=");
			int b = scan.nextInt();
			System.out.println("Enter student score from sub1=");
			int c = scan.nextInt();
			int d=(a+b+c)/3;
			System.out.println(d);
			if(d>=90)
			{
				System.out.println("your score is Marvles");
			}
			else if(d>=80)
			{
				System.out.println("your score is Excelent");
			}
			else if(d>=70)
			{
				System.out.println("your score is good");
			}
			else if(d>=60)
			{
				System.out.println("your score is Average");
			}
			else if(d>=50)
			{
				System.out.println("your score is Poor");
			}
			else
			{
				System.out.println("your score is Bad");
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