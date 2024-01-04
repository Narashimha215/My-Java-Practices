package com.kn.StringDemo;
public class CountStringVCDS 
{
	public static void main(String[] args) 
	{
		String s1 = "I am learning java 397476 #@&";
		@SuppressWarnings("unused")
		String srr[]=s1.split(" ");
		isCharacterArray(s1);
	}
	static void isCharacterArray(String s1) 
	{
		char[] crr = s1.toCharArray();
		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int symbols = 0;
		for(char ch : crr)
		{
			if(Character.isLetter(ch))
			{
				ch = Character.toLowerCase(ch);
				if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' ||ch =='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else
			{
				symbols++;
			}
		}
		System.out.println("Vowels = "+vowels);
		System.out.println("Consonants = "+consonants);
		System.out.println("Digits = "+digits);
		System.out.println("Symbols = "+symbols);
	}
}