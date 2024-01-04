package com.kn.ExceptionHandling;

import java.util.Scanner;

public class Exceptionhandl {

	public static void main(String[] args)throws ArithmeticException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = 9");
		int a = 9;
		System.out.println("Enter b number = 0");
		int b = 0;
		sc.close();
		try {
			int c = a/b;
			System.out.println("Result = "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Number must not be Zero.");
			System.out.println(e.toString());
			//throw e;
			//e.printStackTrace();
		}
		finally{
			System.out.println("Exception block ended");
		}
	}
}