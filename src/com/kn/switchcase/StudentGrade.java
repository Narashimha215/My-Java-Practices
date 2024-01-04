package com.kn.switchcase;

import java.util.Scanner;

public class StudentGrade 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Grade(A-F)=");
		char ch = scan.next().charAt(0);
		switch(ch)
		{
		case 'A':
		    System.out.println("90-100");
			break;
		case 'B':
		    System.out.println("80-89");
			break;
		case 'C':
		    System.out.println("70-79");
			break;
		case 'D':
		    System.out.println("60-69");
			break;
		case 'F':
		    System.out.println("Lesthan 50");
		    break;
		default:
			System.out.println("Invalid Grade");
		}
		scan.close();
	}

}
