package com.kn.StringDemo;

public class LongestWordInString {

	public static void main(String[] args) 
	{
		String s1 = "I am learning java";
		String srr[] = s1.split(" ");
		for(int i=srr.length-1;i>=0;i--)
		{
			if(srr[i].length()>=5)
			System.out.print(srr[i]);
		}
	}
}