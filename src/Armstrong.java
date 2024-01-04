import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=scan.nextInt();
		int sum=0,temp=num,r=0;
		while(num>0)
		{
			r=num%10;
			r=r*r*r;
			sum+=r;
			num/=10;
		}		
		if(sum==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
		scan.close();
	}

}
