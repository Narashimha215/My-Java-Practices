package com.kn.Project;

public class ArrayEvenorOdd {

	public void PrintEvenOddNumbers(int arr[]) {
		
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
	}
	public void PrintEvenOddElements(int arr[]) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Total Even Elements="+arr[i]);
			System.out.println("Total odd Elements="+arr[i]);
		}
	}
}