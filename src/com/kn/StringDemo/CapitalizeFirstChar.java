package com.kn.StringDemo;

import java.util.Scanner;

public class CapitalizeFirstChar {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String s1 = scan.nextLine();
		CapitalizeFirstCharaDemo capitalizeFirstChar = new CapitalizeFirstCharaDemo();
		capitalizeFirstChar.capitalizeFirstChare(s1);
		scan.close();
	}
}
