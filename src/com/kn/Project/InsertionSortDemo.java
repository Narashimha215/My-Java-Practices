package com.kn.Project;
public class InsertionSortDemo 
{
	public int[] insertionSortMethod(int arr[]) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return arr;
	}
}
