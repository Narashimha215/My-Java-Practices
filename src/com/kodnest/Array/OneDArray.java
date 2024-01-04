package com.kodnest.Array;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n[] = new int[5];
		System.out.println("Enter the number = ");
		for(int i=0;i<n.length;i++)
		{
			n[i]= scan.nextInt();
		}
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
		scan.close();
	}
}