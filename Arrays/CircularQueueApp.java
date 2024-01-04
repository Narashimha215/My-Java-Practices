package Arrays;

import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size = ");
		int n= sc.nextInt();
		CircularQueue cq = new CircularQueue(n);
		while(true) {
			System.out.println("Press 1 ------> Insertion");
			System.out.println("Press 2 ------> Deletion");
			System.out.println("Press 3 ------> Display");
			System.out.println("Any other number ------> Stop");
			System.out.println("Enter your choice = ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				cq.insert();
				break;
			case 2:
				cq.delete();
				break;
			case 3:
				cq.display();
				break;
			default:
				System.exit(0);
			}
		}
	}
}