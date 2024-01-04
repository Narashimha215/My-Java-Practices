import java.util.Scanner;

public class WhileRevNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		int r,count=0;
		while(num>0)
		{
			r=num%10;
			
			num=num/10;
			System.out.print(r);
			count++;
		}
		
		System.out.print(count);
		scan.close();
	}

}
