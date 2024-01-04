//w.a.p to print sum of all the elements of array
package com.kn.array;

import java.util.Scanner;

public class Array5 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
		scan.close();
	}
}