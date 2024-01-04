package com.kn.StringDemo;

import java.util.Scanner;

public class PasswordCipherText {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String str = scan.nextLine();
		char crr[] = str.toCharArray();
		System.out.println("Enter the Number you want add = ");
		int n = scan.nextInt();
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]>=65 && crr[i]<=90 || crr[i]>=97 && crr[i]<=122)
			{
				if(crr[i]+n<=122 || crr[i]+n<=90)
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
		scan.close();
	}

}
