package com.kodnest.day;

import java.util.Scanner;

public class MultipleOf35
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enrer the number = ");
		int num = scan.nextInt();
		if((num*3)%3==0 & num%5==0)
		{
			System.out.println(num+" This number is divisible by 3 and 5");
		}
		else
		{
			System.out.println(num+" This number is not divisible by 3 and 5");
		}
		scan.close();
	}
}