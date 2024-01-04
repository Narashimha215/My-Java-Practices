package com.kn.StringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class CharactersSeqeuance {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String a = scan.nextLine();
		char[] crr=a.toCharArray();
		Arrays.sort(crr);
		System.out.println(crr);
		scan.close();
	}
}