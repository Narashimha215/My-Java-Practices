package com.kn.Project;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int arr[] = {15,16,6,8,5};
		int temp =0;
		System.out.print("Before sorting=");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
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
		System.out.println();
		System.out.print("After sorting=");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}