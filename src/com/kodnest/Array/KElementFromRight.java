package com.kodnest.Array;

import java.util.Arrays;

public class KElementFromRight {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7};
		int k = 3;
		System.out.println("Original Array = "+Arrays.toString(arr));
		rotatedArray(arr,k);
		System.out.println("Rotated Array = "+Arrays.toString(arr));
		
	}
	public static void rotatedArray(int arr[],int k) 
	{
		int n = arr.length;
		k = k%n;
		int temp[]= new int[n];
		for(int i=0;i<n;i++)
		{
			temp[i] = arr[(n-k+i)%n];
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=temp[i];
		}
	}
}