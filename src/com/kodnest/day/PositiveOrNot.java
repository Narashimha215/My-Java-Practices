package com.kodnest.day;

import java.util.Scanner;

public class PositiveOrNot {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = scan.nextInt();
		if(num>0)
		{
			System.out.println(num+" This number is positive ");
		}
		else
		{
			System.out.println(num+" This number is negative");
		}
		scan.close();
	}

}
