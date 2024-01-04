package com.kn.String;
public class StringComparision 
{
	public static void main(String[] args) 
	{
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = "Ram"+"Sita";
		System.out.println(s1);
		System.out.println(s2);
		String s4 = "Ram"+"Sita";
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