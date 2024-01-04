package ForLoop;

import java.util.Scanner;

public class NaturalNum 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number=");
		int num=scan.nextInt();
		int sum=calculateSum(num);
		System.out.println(sum);
		scan.close();
	}
	static int calculateSum(int num) 
	{
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum+=i;
		}
		return sum;
		
	}

}
