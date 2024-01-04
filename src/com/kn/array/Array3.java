//write a java programe to print even numbers in an array
package com.kn.array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number=");
		int[] arr = new int[scan.nextInt()];
		for(int i=2;i<=arr.length;i=i+2)
		{
			System.out.println(i);
		}
		scan.close();
	}
}