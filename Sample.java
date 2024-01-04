import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the given number=");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			System.out.println(i);
		}
		scan.close();
	}
}