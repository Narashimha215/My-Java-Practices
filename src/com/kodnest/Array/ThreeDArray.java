package com.kodnest.Array;
public class ThreeDArray 
{
	public static void main(String[] args) 
	{
		byte arr[][][]=new byte[2][2][2];
		arr[0][0][0]=10;
		arr[0][0][1]=20;
		arr[0][1][0]=30;
		arr[0][1][1]=40;
		arr[1][0][0]=50;
		arr[1][0][1]=60;
		arr[1][1][0]=70;
		arr[1][1][1]=80;
		System.out.println("This is 3d array = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				for(int k=0;k<arr.length;k++)
				{
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}
}