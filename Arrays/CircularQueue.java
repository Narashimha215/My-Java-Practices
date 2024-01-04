package Arrays;

import java.util.Scanner;

public class CircularQueue {
	int cq[];
	int size;
	int r=-1;
	int f=0;
	int count=0;
	Scanner sc = new Scanner(System.in);
	public CircularQueue(int n) {
		cq = new int[n];
		size = cq.length;
	}
	public void insert() {
		int ele;
		if(count==size) {
			System.out.println("Insertion not possible");
		}else {
			System.out.print("Enter the element = ");
			ele = sc.nextInt();
			r = (r+1)%size;
			cq[r] = ele;
			count++;
		}
	}
	public void delete() {
		if(count==0) {
			System.out.println("deletion not possible");
		}else {
			System.out.print("Element deleted is = "+cq[f]);
			f = (f+1)%size;
			count--;
		}
	}
	public void display() {
		int f1=f;
		if(count==0) {
			System.out.println("Display not possible");
		}else {
			for(int i=1;i<=count;i++) {
				System.out.print(cq[f1]+" ");
				f1=(f1+1)%size;
			}
			System.out.println();
		}
	}
}