package StarProgrames;
public class Star6
{
    public static void main(String[] args) 
    {
        int n =4;
        for (int i = 0; i < n; i++) 
        {
            int m = 1;
            for (int j = 1; j < n - i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) 
            {
                System.out.print(m + " ");
                m = m * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}