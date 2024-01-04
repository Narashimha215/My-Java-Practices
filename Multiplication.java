import java.util.Scanner;

public class Multiplication 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int m = 5;
		for(int i = 1; i<=10; i++)
		{
			System.out.println(m+"*"+i+"="+i*m);
		}
		scan.close();
	}

}
