package com.kn.switchcase;

import java.util.Scanner;

public class Product 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter product code(0-6)=");
		int day = scan.nextInt();
		switch(day)
		{
		case 0:
			System.out.println("Rice");
			break;
		case 1:
			System.out.println("Biscuts");
			break;
		case 2:
			System.out.println("Chocolate");
			break;
		case 3:
			System.out.println("Icecream");
			break;
		case 4:
			System.out.println("Sugar");
			break;
		case 5:
			System.out.println("Salt");
		    break;
		case 6:
			System.out.println("Pen");
			break;
		default:
			System.out.println("This is invalid product code");
		}
		scan.close();
	}

}
