package com.kn.Project;
import java.util.Scanner;
public class BubbleSort1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size=");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the element"+(i+1)+"= ");
			arr[i]=scan.nextInt();
		}
		BubbleSortDemos b1 = new BubbleSortDemos();
		int crr[]= b1.sort(arr);
		System.out.println("After Sorting");
		for(int i:crr)
		{
			System.out.println(i+" ");
		}
		scan.close();
	}
}