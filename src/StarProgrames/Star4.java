package StarProgrames;
public class Star4 
{
	public static void main(String[] args) 
	{
		int k=0;
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
			for(int j=1;j<=9;j++)
			{
				if(k>=j && k+j<=10 || k<=j && k+j>=10)
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