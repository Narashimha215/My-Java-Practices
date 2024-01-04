package com.kn.elseif;

import java.util.Scanner;

public class StudentResults {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the student marks=");
		int m = scan.nextInt();
		boolean b = isPassorFail(m);
		if(b == true)
		{
			System.out.println("Student Pass");
		}
		else
		{
			System.out.println("Student fail");
		}
		scan.close();
	}
	static boolean isPassorFail(int m) 
	{
		if(m>=50)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
