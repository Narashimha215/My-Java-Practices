import java.util.Scanner;

public class FibonanciSeries {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number=");
		int num = scan.nextInt();
		int nextNumber=0;
		int firstNumber=0,secondNumber=1;
		System.out.print(firstNumber+" "+secondNumber+" ");
		for(int i=2;i<num;i++)
		{
			nextNumber=firstNumber+secondNumber;
			System.out.print(nextNumber+" ");
			firstNumber=secondNumber;
			secondNumber= nextNumber;
		}
		scan.close();
	}

}
