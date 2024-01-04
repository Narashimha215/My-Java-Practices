package com.kn.simpleif;

import java.util.Scanner;

public class Adult 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number=");
		int num = scan.nextInt();
		boolean flag = isAdult(num);
		if(flag == true)
		{
			System.out.println("The person is adult");
		}
		else
		{
			System.out.println("The person is not adult");
		}
		scan.close();
	}
	static boolean isAdult(int num) {
		if(num>=21)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
