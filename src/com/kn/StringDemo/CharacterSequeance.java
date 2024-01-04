package com.kn.StringDemo;

public class CharacterSequeance {

	public void CharSequ(String a) 
	{
		char[] crr=a.toCharArray();
		crr = sortCharacterSequence(crr);
		int count =1;
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i] == crr[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(crr[i]+" occured = "+count);
				count=1;
			}
			if(i+1 == crr.length-1)
			{
				System.out.println(crr[i+1]+" occured = "+count);
			}
		}
	}
	public char[] sortCharacterSequence(char[] crr) 
	{
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr.length-1-i;j++)
			{
				char temp = crr[j];
				crr[j]= crr[j+1];
				crr[j+1]= temp;
			}
		}
		return crr;
	}
}