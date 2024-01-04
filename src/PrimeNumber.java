import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		
		boolean isPrime = true;
		int num = 11;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("NOt Prime");
		}
	}
}
