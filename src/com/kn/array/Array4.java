//print a java program all the numbers those are divisible by 5 in an array
package com.kn.array;

import java.util.Scanner;

public class Array4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number=");
		int []arr= new int[scan.nextInt()];
		for(int i=5; i<=arr.length;i=i+5)
		{
			System.out.println(i);
		}
		scan.close();
	}
}