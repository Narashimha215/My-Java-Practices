package com.kn.Project;

import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter arr size=");
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter brr size=");
		int brr[]= new int[scan.nextInt()];
		System.out.println("Enter the Arr elements=");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}

		System.out.println("Enter the Brr elements=");
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=scan.nextInt();
		}
		int[] crr= mergeofArray(arr, brr);
		System.out.println("crr elements are = ");
		for(int i=0;i<crr.length;i++)
		{
			System.out.print(crr[i]+" ");
			
		}
		
		scan.close();
	}
	static int[] mergeofArray(int arr[],int brr[]) 
	{
		int crr[]=new int[arr.length+brr.length];
		for(int i=0;i<arr.length;i++)
		{
			crr[i]=arr[i];
		}
		int j=0;
		for(int i=arr.length;i<crr.length;i++)
		{
			crr[i]=brr[j];
			j++;
		}
		return crr;
	}
}
