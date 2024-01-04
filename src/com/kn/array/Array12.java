package com.kn.array;

import java.util.Scanner;

public class Array12 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arr[][][];
		int brr[][][];
		arr = new int[2][2][5];
		brr = new int[arr.length][arr[0].length][arr[0][0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[0][0].length;k++)
				{
					System.out.println("Enter the elements=");
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				for(int k=0;k<brr[0][0].length;k++)
				{
					System.out.println("Enter the another elements=");
					brr[i][j][k] = scan.nextInt();
				}
			}
		}
		findTwoDArrayElementSum(arr, brr);
		scan.close();
	}
	static void findTwoDArrayElementSum(int [][][]arr,int [][][]brr) 
	{
		int crr[][][]=new int[arr.length][arr[0].length][arr[0][0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				for(int k=0;k<brr[0][0].length;k++)
				{
					crr[i][j][k]=arr[i][j][k]+brr[i][j][k];
					System.out.println(crr[i][j][k]);
				}
			}
		}
	}
}