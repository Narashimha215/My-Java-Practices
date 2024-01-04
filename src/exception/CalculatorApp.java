package exception;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Calculator Application");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numerator value = ");
		int n = scan.nextInt();
		System.out.println("Enter Dinomerator value = ");
		int d = scan.nextInt();
		double division = 0;
		// Exception handling code
		try 
		{
			division = n/d;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Denominator must not be Zero");
		}
		System.out.println("Division = "+division);
		System.out.println("Thank you for using Calculator application");
		scan.close();
	}
}