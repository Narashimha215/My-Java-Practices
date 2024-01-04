package ForLoop;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range=");
		int num = scan.nextInt();
		int count=0;
		for(int j=2;j<=num;j++) 
		{
			for(int i=1;i<=j;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(j);
			}
		}
		scan.close();
	}

}
