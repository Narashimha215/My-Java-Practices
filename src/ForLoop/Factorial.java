package ForLoop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number=");
		int num=scan.nextInt();
		int sum=factorilNum(num);
		System.out.println(sum);
		scan.close();
	}
	static int factorilNum(int num) 
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}
}
