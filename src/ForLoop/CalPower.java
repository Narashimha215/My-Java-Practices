package ForLoop;

import java.util.Scanner;
public class CalPower 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number=");
		int num=scan.nextInt();
		System.out.println("Enter the power=");
		int exponent=scan.nextInt();
		NumPower(num,exponent);
		scan.close();
	}
	static void NumPower(int num,int exponent) 
	{
		int pow=1;
		for(int i=1;i<=exponent;i++)
		{
			pow=pow*num;
			
		}
		System.out.println(pow);
	}

}
