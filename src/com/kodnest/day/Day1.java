package com.kodnest.day;
import java.util.Scanner;
public class Day1
{
	public static void main(String[] args) 
	{
		System.out.println("Narashimha Reddy");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int a = scan.nextInt();
		System.out.println("Enter b Number = ");
		byte b = scan.nextByte();
		System.out.println("Enter c Number = ");
		short c = scan.nextShort();
		System.out.println("Enter d Number = ");
		long d = scan.nextLong();
		System.out.println("Enter e Number = ");
		float e = scan.nextFloat();
		System.out.println("Enter f Number = ");
		double f = scan.nextDouble();
		System.out.println("Enter g Number = ");
		char g = scan.next().charAt(0);
		System.out.println("Enter h Number = ");
		boolean h = scan.nextBoolean();
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
		c=(short)(c+b);
		System.out.println(c);
		d = d-a;
		System.out.println(d);
		e = e*b;
		System.out.println(e);
		f = f%a;
		System.out.println(f);
		scan.close();
	}
}