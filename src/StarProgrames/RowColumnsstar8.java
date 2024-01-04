package StarProgrames;
public class RowColumnsstar8
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j<=6 && j-i>=0)
				{
				System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}