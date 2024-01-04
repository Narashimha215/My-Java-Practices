package com.kn.switchcase;

import java.util.Scanner;

public class Englishword 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value=");
		int a= scan.nextInt();
		int isEnglish = a;
		switch(a)
		{
		case 0:
		    System.out.println("a");
			break;
		case 1:
		    System.out.println("b");
			break;
		case 2:
		    System.out.println("c");
			break;
		case 3:
		    System.out.println("d");
			break;
		case 4:
		    System.out.println("e");
		    break;
		case 5:
		    System.out.println("f");
			break;
		case 6:
		    System.out.println("g");
			break;
		case 7:
		    System.out.println("h");
			break;
		case 8:
		    System.out.println("i");
			break;
		case 9:
		    System.out.println("j");
		    break;
		default:
			System.out.println("Invalid");
		}
		scan.close();
	}
	static int isEnglish(int a) 
	{
		return a;
	}
}
