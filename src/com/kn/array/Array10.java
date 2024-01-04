package com.kn.array;

public class Array10 {

	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50};
		int brr[] = {110,120,130,140,150};
		sumOfArrays(arr,brr);
	}
		static void sumOfArrays(int arr[], int brr[])
		{
			int crr[] = new int[5];
			int drr[] = new int[5];
			for(int i=0;i<arr.length;i++)
			{
					crr[i]=arr[i]+brr[i];
					drr[i]=arr[i]*brr[i];
			}
			System.out.println("Addition of an array");
			for(int i=0;i<crr.length;i++)
			{
				System.out.println(crr[i]);
				
			}
			System.out.println("Multiplication of an array");
			for(int i=0;i<drr.length;i++)
			{
				System.out.println(drr[i]);
			}
		}
}
