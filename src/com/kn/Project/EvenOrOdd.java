package com.kn.Project;

import java.util.Scanner;

public class EvenOrOdd 
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
		sumOfElements(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even Element is="+arr[i]);
			}
			else
			{
				System.out.println("Odd Element is="+arr[i]);
			}
		}
		
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
