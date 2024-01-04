package Arrays;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size = ");
		int n = sc.nextInt();
		Stack st = new Stack(n);
		while(true) {
			System.out.println("Press 1 ----->PUSH");
			System.out.println("Press 2 ----->POP");
			System.out.println("Press 3 ----->DELETE");
			System.out.println("Any other numbers----->STOP");
			System.out.print("Enter your choice = ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				st.push();
				break;
			case 2:
				st.pop();
				break;
			case 3:
				st.display();
				break;
			default:
				System.exit(0);
			}
		}
	}
}