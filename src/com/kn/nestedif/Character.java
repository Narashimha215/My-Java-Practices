package com.kn.nestedif;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character=");
		char ch= scan.next().charAt(0);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.println("This is Upper case vowel");
			}
			else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println("This is Lower case vowel");
			}
			else if(ch>='A' && ch<='Z')
			{
				System.out.println("This is Upper case consonant");
			}
			else if(ch>='a' && ch<='z')
			{
				System.out.println("This is Lower case consonant");
			}	
			else if(ch=='!' || ch =='*'||ch=='@' || ch =='#'||ch=='$' || ch =='%' || ch=='^' || ch =='&')
			{
				System.out.println("This is special character");
			}
			else
			{
				System.out.println("This is digit");
			}
		scan.close();
	}

}
