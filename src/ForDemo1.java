import java.util.Scanner;

public class ForDemo1 
{
	public static void main(String[] args) 
	{
		int i=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number=");
		int n=scan.nextInt();
		int m=n*i;
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"* "+i+"="+m);
		}
		scan.close();
	}
}
