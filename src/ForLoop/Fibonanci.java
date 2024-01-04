package ForLoop;

import java.util.Scanner;

public class Fibonanci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number=");
		int num=scan.nextInt();
		fibonanciSeries(num);
		scan.close();
	}
	static void fibonanciSeries(int num) 
	{
		int a=0,b=1,c=0;
		System.out.print(a+" "+b);
		for(int i=2;i<num;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}

}
