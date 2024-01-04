import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int factorial=1;
		for(int i=num;i>=1;i--)
		{
			factorial = factorial*i;
		}
		System.out.println("The factorial of given number"+num+"="+factorial);
		scan.close();
	}
}
