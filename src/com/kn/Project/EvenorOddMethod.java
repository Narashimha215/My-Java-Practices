package com.kn.Project;
public class EvenorOddMethod 
{
	public void evenOddElements(int arr[]) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" is an Even Number");
			}
			else
			{
				System.out.println(arr[i]+" is an Odd Number");
			}
		}
	}
}
