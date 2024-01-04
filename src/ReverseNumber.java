import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number=");
		int num = scan.nextInt();
		int r;		
		for(int i=1;num>0;i++)
		{
			r= num%10;
			num=num/10;
			System.out.print(r);
		}
		scan.close();
	}
}
