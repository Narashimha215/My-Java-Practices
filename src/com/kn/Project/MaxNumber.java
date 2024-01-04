package com.kn.Project;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size=");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the element"+(i+1)+"= ");
			arr[i]=scan.nextInt();
		}
		System.out.print("Before sorting=");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		secondMin(arr);
		System.out.println();
		System.out.print("After sorting=");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Maximum Number = "+arr[arr.length-1]);
		scan.close();
	}
	static void secondMin(int arr[]) 
	{
		int temp =0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}