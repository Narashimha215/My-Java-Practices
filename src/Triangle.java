
public class Triangle {

	public static void main(String[] args) {
		int row=5;
		int numStars=1;
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= numStars; j++)
			{
				System.out.print("* ");
			}
			numStars++;
			System.out.println();
		}
	}

}
