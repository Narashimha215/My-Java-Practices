package com.kn.array;

import java.util.Scanner;

public class Array6 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[] arr= {2,4,6,8,10};
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println("Enter integer data for the element"+(i+1)+":");
			arr[i]=scan.nextInt();
			if(arr[i]%2==0)
			{
				System.out.println("This is Even");
			}
			else
			{
				System.out.println("This is Odd");
			}
		}
		scan.close();
	}
}