package com.kn.StringDemo;

public class CapitalizeFirstCharacter {

	public static void main(String[] args) 
	{
		String s1 = "I Love Java Programing";
		String srr[] = s1.split(" ");
		for(String s:srr)
		{
			char crr[] =s.toCharArray();
			for(int i=0;i<crr.length;i++)
			{
				if(crr[i]<97 && crr[i]<=122)
				{
					crr[i] = (char)(crr[i]+32);
				}
				System.out.print(crr[i]);
			}
			System.out.print(" ");
		}
	}
}
//in a string convert uper case alpabets to lower case and vice versa