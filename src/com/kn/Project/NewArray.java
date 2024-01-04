package com.kn.Project;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		int brr[] = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			brr[i] = arr[i];
			System.out.println(brr[i]);
		}
		scan.close();
	}

}
