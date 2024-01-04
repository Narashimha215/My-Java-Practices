package com.kn.Project;
public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int arr[] = {48,32,16,29,72,44,63};
		System.out.print("Before sorting=");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		SelectionSortDemo selectionSort = new SelectionSortDemo();
		int brr[] = selectionSort.sort(arr);
		System.out.println();
		System.out.print("After sorting = ");
		for(int i:brr)
		{
			System.out.print(i+" ");
		}
	}
}