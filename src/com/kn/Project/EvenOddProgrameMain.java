package com.kn.Project;

import java.util.Scanner;

public class EvenOddProgrameMain 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Size = ");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the "+arr[i]+" Element =");
			arr[i]=scan.nextInt();
		}
		EvenorOddMethod ev = new EvenorOddMethod();
		ev.evenOddElements(arr);
		scan.close();
	}
}