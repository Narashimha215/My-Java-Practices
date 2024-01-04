package com.kn.imp;

import java.util.Scanner;

public class Armstorng 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = sc.nextInt();
		int originalNum = num;
		int digits = String.valueOf(num).length();
		int sum=0;
		while(num > 0)
		{
			int digit = num % 10;
			sum += Math.pow(digit, digits);
			num /= 10;
		}
		if(originalNum == sum)
		{
			System.out.println("This is Armstrong");
		}
		else
		{
			System.out.println("This is not Armstrong");
		}
		sc.close();
	}
}