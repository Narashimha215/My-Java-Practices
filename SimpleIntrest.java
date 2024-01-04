import java.util.Scanner;

public class SimpleIntrest 
{

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the profit=");
		int p = scan.nextInt();
		System.out.println("Enter the time=");
		int t = scan.nextInt();
		System.out.println("Enter the rate=");
		int r = scan.nextInt();
		int total=(p*t*r)/100;
		System.out.println(total);
		System.out.println(total+p);
		scan.close();
	}
	static int total(int total)
	{
		return total;
	}
}
