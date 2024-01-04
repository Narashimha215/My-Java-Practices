package com.kn.String;

public class StringMethods {

	public static void main(String[] args) 
	{
		String s1 = "Narashimha Reddy";
		System.out.println("Upper case = "+s1.toUpperCase());
		System.out.println("Lower case = "+s1.toLowerCase());
		System.out.println("Character Index = "+s1.charAt(2));
		System.out.println("Index of Character First time = "+s1.indexOf("a"));
		System.out.println("Index of Character last time = "+s1.lastIndexOf("a"));
		System.out.println("Index of Character First time = "+s1.substring(5));
		System.out.println("Index of Character First time = "+s1.substring(5,10));
		System.out.println("String concatination = "+s1.concat(" Lachayagari"));
		System.out.println("Returns length of this String = "+s1.length());
		System.out.println(s1.startsWith("Narashimha "));
		System.out.println(s1.endsWith(" Reddy"));
		System.out.println(s1.replace("Reddy", "Reddys"));
		System.out.println(s1);
		System.out.println(s1.replaceAll("Na", "Ma"));
		System.out.println("**************************");
		System.out.println(s1);
		String s2="sourav";
		String s3="sachin";
		System.out.println(s2.compareTo(s3));
		if(s2.compareTo(s3)>0)
		{
			System.out.println("s1 is Greaterthan s2");
		}
		else if(s2.compareTo(s3)>0)
		{
			System.out.println("s2 is Greaterthan s1");
		}
		else
		{
			System.out.println("s1 & s2 are EqualLexicoggrapicaly");
		}
	}
}