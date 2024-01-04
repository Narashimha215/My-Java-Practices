package com.kn.Project;
public class ArrayElementsFound 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50,60,70};
		int element= 40;
		int position = foundofArray(arr,element);
		System.out.println("element "+element+" is found at position="+position);
	}
	static int foundofArray(int arr[],int element) 
	{
		boolean isFound = false; 
		int position=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				isFound =true;
				position =++i;
				break;
			}
		}
		if(isFound==true)
		{
			return position;
		}
		else
		{
			return -1;
		}
	}
}
