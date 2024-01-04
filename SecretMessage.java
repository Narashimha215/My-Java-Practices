import java.util.Scanner;

public class SecretMessage 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the message=");
		char ch=scan.next().charAt(0);
		System.out.println("unicode = "+ch+" is "+decodeMessage(ch));	
		scan.close();
	}
	static int decodeMessage(char ch)
	{
		return ch;
	}
}