package StarProgrames;
public class RowColumnsstar6
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;(i+j)<=6;j++)
			{
				System.out.print(6-j);
			}
			System.out.println();
		}
	}
}