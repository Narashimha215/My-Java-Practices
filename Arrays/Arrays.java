package Arrays;

import java.util.Scanner;

public class Arrays {
	private int arr[];
	Scanner sc = new Scanner(System.in);
	public Arrays(int n) {
		arr = new int[n];
	}
	public void insert() {
		System.out.print("Enter the position from 0 to "+(arr.length-1)+" = ");
		int pos = sc.nextInt();
		System.out.print("Enter the element = ");
		int ele = sc.nextInt();
		arr[pos] = ele;
	}
	public void delete() {
		System.out.print("Enter the position to delete the element =");
		int pos = sc.nextInt();
		System.out.println("Element deleted is "+arr[pos]);
		arr[pos] = 0;
	}
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}