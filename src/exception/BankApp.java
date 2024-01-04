package exception;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Bank Application Started.");
			System.out.println("Enter your pin = ");
			int pin = sc.nextInt();
			if(pin == 9999)
			{
				System.out.println("Continue with forther transaction");
			}
			else
			{
				System.out.println("Invalid Pin");
			}
		}
		catch(Exception e)
		{
			System.out.println("Pin should a numeric value");
		}
		finally
		{
			sc.close();
			System.out.println("Scanner object closed sussfully");
		}
		System.out.println("Bank Application completed successfully");
	}
}