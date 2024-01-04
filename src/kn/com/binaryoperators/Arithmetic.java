package kn.com.binaryoperators;

public class Arithmetic {

	public static void main(String[] args) 
	{
		int a = 10;
		int b = ++a + a-- + --a + a-- + ++a + a++ + a++ + --a + a-- - --a - a--;
		System.out.println(b);
	}
}