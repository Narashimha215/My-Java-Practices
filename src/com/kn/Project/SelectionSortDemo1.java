package com.kn.Project;

import java.util.Scanner;

public class SelectionSortDemo1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size = ");
		int arr[] = new int[scan.nextInt()];
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter the Element =");
			arr[i]=scan.nextInt();
		}
		SelectionSort2 s = new SelectionSort2();
		s.selectionSortElements(arr);
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		scan.close();
	}

}
