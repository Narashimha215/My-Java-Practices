package com.kodnest.day;

public class For {

	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Car Number: "+(i+1));
		}
		for(int i=0;i<5;i++)
		{
			if(i==2) {
				continue;
			}
			System.out.println("Car Number: "+(i+1));
		}
	}

}
