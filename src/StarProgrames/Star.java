package StarProgrames;
public class Star
{
	public static void main(String[] args) 
	{
		int k=1;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
				k++;
			}
			else
			{
				k--;
			}
			for(int j=1;j<=5;j++)
			{
				if(j>=k-5 && k-j>=1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}