//forward and backward in array
package com.kn.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[] arr; //array declaration
		System.out.print("Enter the value=");
		arr = new int[scan.nextInt()]; //array creation
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print("Enter a "+(i+1)+" Element=");
			arr[i]=scan.nextInt();
		}
		System.out.println("forward");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("backward");
		for(int i = arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
