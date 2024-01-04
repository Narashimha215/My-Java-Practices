package com.kn.StringDemo;

import java.util.Scanner;

public class PasswordDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String str = scan.nextLine();
		char crr[] = str.toCharArray();
		System.out.println("Enter the Number you want add = ");
		int n = scan.nextInt();
		PasswordCipherText1 password = new PasswordCipherText1();
		password.passwordMethod(crr,n);
		scan.close();		
	}
}