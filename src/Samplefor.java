import java.util.Scanner;

public class Samplefor {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number=");
		int num = scan.nextInt();
		for(int i=5;i>=num;i--)
		{
			System.out.println(i);
		}
		scan.close();
	}
}
