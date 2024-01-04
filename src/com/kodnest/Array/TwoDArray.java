package com.kodnest.Array;
public class TwoDArray 
{
	public static void main(String[] args) 
	{
		byte arr[][]=new byte[3][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;
		System.out.println("This is 2d array = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}