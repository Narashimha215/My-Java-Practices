package com.kn.StringDemo;

public class PasswordCipherText1 
{
	public void passwordMethod(char crr[], int n) 
	{
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]>=65 && crr[i]<=90)
			{
				if(crr[i]+n<=90)
				{
					crr[i]=(char)(crr[i]+n);
				}
				else
				{
					crr[i]=(char)(crr[i]+n-26);
				}
			}
			System.out.print(crr[i]);
		}
	}	
}