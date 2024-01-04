package com.kn.StringDemo;

import java.util.Scanner;

public class CharacterSequeanceDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String a = scan.nextLine();
		CharacterSequeance charSeq = new CharacterSequeance();
		charSeq.CharSequ(a);
		scan.close();
	}
}