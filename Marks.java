import java.util.Scanner;

public class Marks{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks=");
		int m = scan.nextInt();
		if(m>=90)
		{
			System.out.println("go to AI");
		}
		else  if(75 <=m || 90 <=m)
		{
			System.out.println("IOT");
		}
		else  if(65<=m || 75<=m)
		{
			System.out.println("Neural Networks");
		}
		else  if(45<=m || 65<=m)
		{
			System.out.println("Quantum Computing");
		}
		else
		{
			System.out.println("IT job");
		}
		scan.close();
	}
	static int m(int m)
	{
		return m;
	}
}
