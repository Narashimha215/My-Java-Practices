package com.kn.StringDemo;

public class CapitalizeFirstCharaDemo 
{
	public void capitalizeFirstChare(String s1)
	{
		String srr[] = s1.split(" ");
		StringBuffer sb = new StringBuffer();
		for(String s:srr)
		{
			char crr[] =s.toCharArray();
			for(int i=0;i<crr.length;i++)
			{
				if(crr[i]<97 && crr[i]<=122)
				{
					crr[i] = (char)(crr[i]+32);
				}
				sb.append(crr[i]);
			}
			sb.append(" ");
		}
		String result = sb.toString();
		System.out.print(result.trim());
	}
}
//w a j p to reverse the string maintaining the space position
//w a j p to print the longest word in the string