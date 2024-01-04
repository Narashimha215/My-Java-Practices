package ForLoop;

import java.util.Scanner;

public class EvenNum 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=2;i<=num;i=i+2)
		{
			System.out.println(i);
		}
		scan.close();
	}

}
