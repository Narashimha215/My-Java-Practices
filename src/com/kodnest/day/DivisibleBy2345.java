package com.kodnest.day;

import java.util.Scanner;

public class DivisibleBy2345 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = scan.nextInt();
		if(num%2==0 & num%3==0 & num%4==0 & num%5==0)
		{
			System.out.println("This number is divisible by 2,3,4,5 = "+num);
		}
		else
		{
			System.out.println("This number is not divisible by 2,3,4,5 = "+num);
		}
		scan.close();
	}
}