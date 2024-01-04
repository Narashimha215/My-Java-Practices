package com.kn.StringDemo;

import java.util.Scanner;

public class IPAddress {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number = ");
		String a = scan.nextLine();
		ValidIpAddress ipAddress = new ValidIpAddress();
		@SuppressWarnings("unused")
		boolean valid = ipAddress.isValidIPAddress(a);
		scan.close();
		if(valid)
		{
			System.out.print("valid");
		}
		else
		{
			System.out.println("Not valid");
		}
	}
}