package ForLoop;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number = ");
		int num1 = scan.nextInt();
		System.out.println("Enter Second number = ");
		int num2 = scan.nextInt();
		System.out.println("The result is = ");
		int res = isGCD(num1,num2);
		System.out.println(res);
		scan.close();
	}
	static int isGCD(int num1,int num2) 
	{
		if(num2==0)
		{
			return num1;
		}
		else
		{
			return isGCD(num2,num1%num2);
		}
	}	
}