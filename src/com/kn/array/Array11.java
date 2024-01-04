package com.kn.array;

import java.util.Scanner;

public class Array11 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arr[][];
		int brr[][];
		arr = new int[2][5];
		brr = new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the elements=");
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				System.out.println("Enter the another elements=");
				brr[i][j] = scan.nextInt();
			}
		}
		findTwoDArrayElementSum(arr, brr);
		scan.close();
	}
	static void findTwoDArrayElementSum(int [][]arr,int [][]brr) 
	{
		int crr[][]=new int[arr.length][arr[0].length];
		System.out.println("The sum an array=");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				crr[i][j]=arr[i][j]+brr[i][j];
				System.out.println(crr[i][j]);
			}
		}
	}
}