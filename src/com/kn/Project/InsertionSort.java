package com.kn.Project;

import java.util.Scanner;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size = ");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Element = ");
			arr[i]=scan.nextInt();
		}
		InsertionSortDemo is = new InsertionSortDemo();
		int brr[] = is.insertionSortMethod(arr);
		System.out.println();
		System.out.println("After sorting");
		for(int i:brr)
		{
			System.out.print(i+" ");
		}
		scan.close();
	}
}