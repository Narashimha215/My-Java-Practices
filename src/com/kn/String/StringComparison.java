package com.kn.String;
public class StringComparison 
{
	public static void main(String[] args) 
	{
		String s1 = "Ram";
		String s2 = "Ram";
		if(s1 == s2)
		{
			System.out.println("References are Equal");
		}
		else
		{
			System.out.println("References are difference");
		}
		if(s1.equals(s2))
		{
			System.out.println("Strings are Equal");
		}
		else
		{
			System.out.println("Strings are not Equal");
		}
		String s3 = new String("sita");
		String s4 = new String("sita");
		if(s3 == s4)
		{
			System.out.println("References are Equal");
		}
		else
		{
			System.out.println("References are difference");
		}
		if(s3.equals(s4))
		{
			System.out.println("Strings are Equal");
		}
		else
		{
			System.out.println("Strings are not Equal");
		}
	}
}