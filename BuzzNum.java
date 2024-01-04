import java.util.Scanner;
public class BuzzNum 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number=");
		int n = scan.nextInt();
		if(n%7==0 || n%10==7)
		{
			System.out.println("Buzz");
		}
		else
		{
			System.out.println(n);
		}
		scan.close();
	}

}
