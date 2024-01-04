package StarProgrames;
public class RowColumnsstar4
{
	public static void main(String[] args) 
	{
//		int n= 5;
//		int num = 1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(num+" ");
//				num++;
//			}
//			System.out.println();
//		}
  	int num=0;
		for(int i=1;i<=5;i++)
		{
			if(i%2 != 0)
			{
				for(int j=1;j<=i;j++)
				{
					num++;
					System.out.print(num+" ");	
				}
			}
			else
			{
				num=num+i;
				for(int j=num;j>num-i;j--)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}