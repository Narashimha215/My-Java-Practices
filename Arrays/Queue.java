package Arrays;

import java.util.Scanner;

public class Queue {
	int q[];
	int size;
	int r=-1;
	int f=0;
	Scanner sc = new Scanner(System.in);
	public Queue(int n) {
		q = new int[n];
		size = q.length;
	}
	public void insert() {
		int ele;
		if(r==size-1) {
			System.out.println("Insertion not possible");
		}else {
			System.out.print("Enter the element = ");
			ele = sc.nextInt();
			++r;
			q[r] = ele;
		}
	}
	public void delete() {
		if(r==-1 || f>r) {
			System.out.println("Deletion not possible");
		}else {
			System.out.println("Element deleted is = "+q[f]);
			++f;
		}
	}
	public void display() {
		if(r==-1 || f>r) {
			System.out.println("Display not possible");
		}else {
			for(int i=f;i<=r;i++) {
				System.out.print(q[i] +" ");
			}
			System.out.println();
		}
	}
}