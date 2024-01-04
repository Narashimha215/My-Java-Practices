package com.kn.Project;

import java.util.Scanner;

public class PrintEvenOddNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size=");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Elements");
			arr[i]=scan.nextInt();
		}
		PrintEvenOddElementsDemo printEvenorOdd = new PrintEvenOddElementsDemo();
		printEvenorOdd.printEvenorOddElements(arr);
		printEvenorOdd.countEvenOddElements(arr);
		scan.close();
	}
}