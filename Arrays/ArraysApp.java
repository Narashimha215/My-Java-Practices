package Arrays;

import java.util.Scanner;

public class ArraysApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length = ");
		int n = sc.nextInt();
		Arrays a = new Arrays(n);
		while(true) {
			System.out.println("Press 1 for Inserting");
			System.out.println("Press 2 for Deleting");
			System.out.println("Press 3 for Display");
			System.out.println("Any other number for Exiting");
			System.out.print("Enter your choice = ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				a.insert();
				break;
			case 2:
				a.delete();
				break;
			case 3:
				a.display();
				break;
			default:
				System.exit(0);
			}
		}
	}
}