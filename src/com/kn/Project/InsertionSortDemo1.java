package com.kn.Project;

import java.util.Scanner;

public class InsertionSortDemo1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size = ");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the elements = ");
			arr[i]=scan.nextInt();
		}
		InsertionSort1 is = new InsertionSort1();
		is.insertionSortMethod(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}
}