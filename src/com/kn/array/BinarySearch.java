package com.kn.array;
public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};
		int element = 40;
		int low = 0;
		int high = a.length-1;
		int mid = (low + high)/2;
		while(low <= high) 
		{
			if(element > a[mid])
			{
				low = mid+1;
			}
			else if(element == a[mid])
			{
				System.out.println(mid+1);
				break;
			}
			else
			{
				high = mid-1;
			}	
			mid = (low + high)/2;
		}
	}
}