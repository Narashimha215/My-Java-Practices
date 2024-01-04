package StarProgrames;
public class RowColumnsstar7
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i+j)<=5)
				{
				System.out.print(" ");
				}
				else
					//System.out.print(i);
				System.out.print(j);
			}
			System.out.println();
		}
	}
}