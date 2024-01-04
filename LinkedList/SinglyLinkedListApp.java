package LinkedList;

import java.util.Scanner;

public class SinglyLinkedListApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList ll = new SinglyLinkedList();
		while(true) 
		{
			System.out.println("Press 1 ------> Insert Rear");
			System.out.println("Press 2 ------> Delete Rear");
			System.out.println("Press 3 ------> Insert Front");
			System.out.println("Press 4 ------> Delete Front");
			System.out.println("Press 5 ------> Display");
			System.out.println("Any other number to ------> Stop");
			System.out.print("Enter your choice = ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				ll.insertrear();
				break;
			case 2:
				ll.deleterear();
				break;
			case 3:
				ll.insertfront();
				break;
			case 4:
				ll.deletefront();
				break;
			case 5:
				ll.display();
				break;
			default:
				System.exit(0);
			}
		}
	}
}