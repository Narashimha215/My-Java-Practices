import java.util.Scanner;

public class Example 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the INR=");
		int a = scan.nextInt();
		double c= a/82.73;
		double d= a/90.02;
		System.out.println("INR to Dollars="+c);
		System.out.println("INR to UROs="+d);
		scan.close();
	}
}
