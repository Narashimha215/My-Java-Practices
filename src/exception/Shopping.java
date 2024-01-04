package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		System.out.println("Welcome to Shopping Application");
		shop();
		System.out.println("Main() method Exited");
	}

	private static void shop() {
		System.out.println("Shop() method Started");
		try
		{
			pay();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Shopping has failled due to Inappropriate pay!");
		}
		System.out.println("Shop() method Ended");
	}

	private static void pay() {
		// throws == Show warning to the method Caller
		System.out.println("Pay() method Started");
		Scanner sc = null;
		System.out.println("Enter the Amount to be Entered");
		try
		{
			sc = new Scanner(System.in);
			double amount = sc.nextDouble();
			System.out.println("Amount Paid = "+amount);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Exceptin handled");
			throw ime;  //re-throwing exception
		}
		sc.close();
		System.out.println("Pay() method Ended");
	}
}