package com.kn.StringDemo;

public class CountStringVCDSS {

	public void isCharacterArray(String s1) 
	{
		char[] crr = s1.toCharArray();
		int uvowels = 0;
		int uconsonants = 0;
		int lvowels = 0;
		int lconsonants = 0;
		int digits = 0;
		int spaces= 0;
		int specialchar = 0;
		for(char ch : crr)
		{
			if(Character.isLetter(ch))
			{
				if(ch == 'A' || ch =='E' || ch =='I' || ch =='O' ||ch =='U')
				{
					uvowels++;
				}
				else if(ch>=65 && ch <= 90)
				{
					uconsonants++;
				}
				else if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' ||ch =='u')
				{
					lvowels++;
				}
				else
				{
					lconsonants++;
				}
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else if(Character.isSpaceChar(ch))
			{
				spaces++;
			}
			else
			{
				specialchar++;
			}
		}
		System.out.println("Upper Vowels = "+uvowels);
		System.out.println("Upper Consonants = "+uconsonants);
		System.out.println("Lower Vowels = "+lvowels);
		System.out.println("Lower Consonants = "+lconsonants);
		System.out.println("Digits = "+digits);
		System.out.println("Spaces = "+spaces);
		System.out.println("Symbols = "+specialchar);
	}
}