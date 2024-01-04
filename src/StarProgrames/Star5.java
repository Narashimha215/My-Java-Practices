package StarProgrames;
public class Star5 
{
	public static void main(String[] args) 
	{
		int k=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i<=j || k==(i+j)%2)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}