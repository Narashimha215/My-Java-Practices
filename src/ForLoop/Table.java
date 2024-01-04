package ForLoop;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number=");
		int num=scan.nextInt();
		multiplyTable(num);
		scan.close();
	}
	static void multiplyTable(int num) 
	{
		int mul=0;
		for(int i=1;i<=10;i++)
		{
			mul=num*i;
			System.out.println(num+"*"+i+"="+mul);
		}
	}

}
