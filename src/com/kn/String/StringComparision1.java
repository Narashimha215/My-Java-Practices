package com.kn.String;
public class StringComparision1
{
	public static void main(String[] args) 
	{
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = s1+"sita";
		String s4 = s1+"sita";
		System.out.println(s2);
		if(s3 == s4)
		{
			System.out.println("Same Reference");
		}
		else
		{
			System.out.println("Not Same Reference");
		}
		if(s3.equals(s4))
		{
			System.out.println("Same Data");
		}
		else
		{
			System.out.println("Not Same Data");
		}
	}
}