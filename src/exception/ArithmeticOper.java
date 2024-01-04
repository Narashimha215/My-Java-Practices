package exception;

import java.util.Scanner;

public class ArithmeticOper {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Programe started.....");
		
		add();
		sub();
		mul();
		div();
		System.out.println("Main() method completed");
	}

	private static void add() 
	{	
		System.out.println("The addition() method started");
		System.out.println("Enter the First number = ");
		int a = sc.nextInt();
		System.out.println("Enter the Second number = ");
		int b = sc.nextInt();
		int c= a+b;
			System.out.println("Addition = "+c);
			System.out.println("The addition() method Ended");
	}

	private static void sub() {
		System.out.println("The subtraction() method started");
		System.out.println("Enter the First number = ");
		int a = sc.nextInt();
		System.out.println("Enter the Second number = ");
		int b = sc.nextInt();
		int c = 0;
		try
		{
			c= a-b;
			System.out.println("Subtraction = "+c);
			System.out.println("The subtraction() method Ended");
		}catch(ArithmeticException e) {
			System.out.println("The operator must be (-)");
		}		
		System.out.println("The subtraction() method Ended");
	}

	private static void mul() {
		System.out.println("The addition() method started");
		System.out.println("Enter the First number = ");
		int a = sc.nextInt();
		System.out.println("Enter the Second number = ");
		int b = sc.nextInt();
		int c = 0;
		try
		{
			c= a*b;
			System.out.println("Multiplication = "+c);
			System.out.println("The multilicatin() method Ended");
		}catch(ArithmeticException e) 
		{
			// Ducking the exception by catching it but not taking any action
            // You can add logging or other actions here if needed
        }

        System.out.println("The multiplication() method Ended");			
	}

	private static void div() {
		System.out.println("The division() method started");
		System.out.println("Enter the First number = ");
		int a = sc.nextInt();
		System.out.println("Enter the Second number = ");
		int b = sc.nextInt();
		int c = 0;
		try
		{
			c= a+b;
			System.out.println("division = "+c);
			System.out.println("The division() method Ended");
		}catch(ArithmeticException e) {
			System.out.println("The operator must be (/)");
		}		
        System.out.println("The division() method Ended");			
	}

	
}