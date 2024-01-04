package com.kn.elseif;

import java.util.Scanner;

public class EligibleForDiscount {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age=");
		int m = scan.nextInt();
		boolean b = isPassorFail(m);
		if(b == true)
		{
			System.out.println("Eligible for senior citezen Discount");
		}
		else
		{
			System.out.println("Not Eligible for senior citezen Discount");
		}
		scan.close();
	}
	static boolean isPassorFail(int m) 
	{
		if(m>=60)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
