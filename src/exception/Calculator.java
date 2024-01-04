package exception;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome Calculator Application");
		System.out.println("Enter First number = ");
		int a = sc.nextInt();
		System.out.println("Enter second number = ");
		int b = sc.nextInt();
		multiply(a,b);
		System.out.println("Thank for using Calculator Application");
		sc.close();
	}

	private static void multiply(int a, int b) 
	{
		System.out.println("Maltiply() method Started");
		int product = a * b;
		System.out.println("Multiplication = "+product);
		divide(a,b);
		System.out.println("Maltiply() Method Ends");
	}

	private static void divide(int a, int b) 
	{
		System.out.println("Divide() method Started");
		double quotient=0;
		try {
		quotient = a / b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Second number must not Zero");
		}
		System.out.println("Division  = "+quotient);
		System.out.println("Divide() method Ends");
	}
}