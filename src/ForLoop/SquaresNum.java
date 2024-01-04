package ForLoop;

import java.util.Scanner;

public class SquaresNum 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number=");
		int num = scan.nextInt();
		for(int i=4;i<=num;i++)
		{
			System.out.println(i*2);
		}
	}

}
