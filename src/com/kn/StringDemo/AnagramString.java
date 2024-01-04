package com.kn.StringDemo;

public class AnagramString 
{
	public boolean isAnagram(String a, String b) 
	{
		boolean isAnagram = false;
		if(a.length() == b.length())
		{
			char[] arr = a.toCharArray();
			char[] brr = b.toCharArray();
			arr = sortCharacterArray(arr);
			brr = sortCharacterArray(brr);
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i] != brr[i])
				{
					return false;
				}
			}
			isAnagram = true;
		}
		return isAnagram;
	}
	public char[] sortCharacterArray(char crr[]) 
	{
		for(int i=0;i<crr.length-1;i++)
		{
			for(int j=0;j<crr.length-1-i;j++)
			{
				if(crr[j] > crr[j+1])
				{
					char temp = crr[j];
					crr[j] = crr[j+1];
					crr[j+1] = temp;
				}
			}
		}
		return crr;
	}
}
