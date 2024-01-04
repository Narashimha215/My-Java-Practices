package com.kn.String;
public class StringComparision3
{
	public static void main(String[] args) 
	{
		String s1 = "Ram";
		String s2 = "RAM";
		if(s1.equals(s2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Unequal");
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Unequal");
		}
	}
}