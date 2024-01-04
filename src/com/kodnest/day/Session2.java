package com.kodnest.day;
public class Session2 
{
	public static void main(String[] args) 
	{
		int a=20;
		byte b= (byte)a;
		a=a+b;
		b=(byte)(b++ + a+a + a/b + b%a);
		System.out.println(b);
		long l=b;
		System.out.println(l);
		byte m=0;
		b=m;
	}
}
//w a j p to check the given number is divisible 2,3,4,5
//w a j p to check the given number is multiple of 3 and 5
//w a j p to check the given number is positive or not
//w a j p to check the given number is polindrome or not
//w a j p to check the given number anagram or not
//w a j p to check a given number is divisible by 4 or not using a dedicated method