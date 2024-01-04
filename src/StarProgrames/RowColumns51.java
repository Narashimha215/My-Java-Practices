package StarProgrames;
public class RowColumns51 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;(i+j)<=6;j++)
			{
				//System.out.print((char)(70-i));
				System.out.print((char)(70-j));

			}
			System.out.println();
		}
	}
}