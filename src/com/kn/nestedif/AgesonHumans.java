package com.kn.nestedif;

import java.util.Scanner;

public class AgesonHumans 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age=");
		int n = scan.nextInt();
			if(n<=12)
			{
				System.out.println("Child");
			}
			else if(n<=19)
			{
				System.out.println("Teen");
			}
			else if(n<=59)
			{
				System.out.println("Adult");
			}
		else
		{
			System.out.println("Senior");
		}
		scan.close();
	}

}
