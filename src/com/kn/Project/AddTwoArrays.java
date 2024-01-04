package com.kn.Project;

import java.util.Scanner;

public class AddTwoArrays
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the arr size=");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the brr size=");
		int brr[] = new int[scan.nextInt()];
		int sum =0;
		System.out.println("Enter the arr Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the brr Elements");
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=scan.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("element "+(i+1)+" for First array ="+arr[i]);
			System.out.println("element "+(i+1)+" for Second array ="+brr[i]);
			sum=arr[i]+brr[i];
			System.out.println("Sum of two arrays = "+sum);
		}	
		sumOfElements(arr,brr);
		scan.close();
	}
	static int[] sumOfElements(int arr[],int brr[]) 
	{
		int crr[]= new int[arr.length];
		for(int i=0;i<crr.length;i++)
		{
			crr[i]=arr[i]+brr[i];
		}
		return crr;
	}

}