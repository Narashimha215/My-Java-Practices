package com.kn.Project;
public class ArrayEvenOdd
{
	public void PrintEvenOddElementsDemo(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" is an even number");
			}
			else
			{
				System.out.println(arr[i]+" is an odd number");
			}
		}
	}
	public void countEvenOddElements(int[] arr) 
	{
		int evenCount=0,oddCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Number of even elements= "+evenCount);
		System.out.println("Number of odd elements= "+oddCount);
	}
}