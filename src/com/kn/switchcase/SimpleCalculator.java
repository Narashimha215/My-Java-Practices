package com.kn.switchcase;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value=");
		int a= scan.nextInt();
		System.out.println("Enter b value=");
		int b= scan.nextInt();
		System.out.println("Enter a Symbol");
		char ch = scan.next().charAt(0);
		switch(ch)
		{
		case '+':
		    System.out.println(a+b);
			break;
		case '-':
		    System.out.println(a-b);
			break;
		case '*':
		    System.out.println(a*b);
			break;
		case '/':
		    System.out.println(a/b);
			break;
		case '%':
		    System.out.println(a%b);
		    break;
		default:
			System.out.println("Invalid");
		}
		scan.close();
	}

}
