package com.kn.simpleif;
import java.util.Scanner;

public class Voting1
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age=");
		int age=scan.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		scan.close();
	}
}