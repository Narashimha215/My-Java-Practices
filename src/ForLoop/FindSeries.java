package ForLoop;

import java.util.Scanner;

public class FindSeries 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		findSeriesSum(num);
	}
	static void findSeriesSum(int num) 
	{
		double sum=0.0;
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0) {
				sum=sum+1/i;
				
			}
			
		}
		System.out.println(sum);
	}
}
