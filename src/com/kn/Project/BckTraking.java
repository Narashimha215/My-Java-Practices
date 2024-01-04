package com.kn.Project;

import java.util.Scanner;

public class BckTraking {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size=");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Elements");
			arr[i]=scan.nextInt();
		}
		int[] crr = copyArrayElements(arr);
		for(int j=crr.length-1;j>=0;j--)
		{
			System.out.println("Elements are"+crr[j]);
		}
		scan.close();
	}
	static int[] copyArrayElements(int arr[]) 
	{
		int brr[]= new int[arr.length];
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=arr[i];
		}
		return brr;
	}
}
