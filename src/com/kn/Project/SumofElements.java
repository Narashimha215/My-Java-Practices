package com.kn.Project;

import java.util.Scanner;

public class SumofElements 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size=");
		int arr[] = new int[scan.nextInt()];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Elements");
			arr[i]=scan.nextInt();
		}
		sumOfElements(arr);
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of elements="+sum);
		scan.close();
	}
	static int[] sumOfElements(int arr[]) 
	{
		int brr[]= new int[arr.length];
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=arr[i];
		}
		return brr;
	}
}
