package Arrays;

import java.util.Scanner;

public class Stack {
	int s[];
	int size;
	int top=-1;
	Scanner sc = new Scanner(System.in);
	public Stack(int n) {
		s = new int[n];
		size = s.length;
	}
	public void push() {
		int ele;
		if(top==size-1) {
			System.out.println("push not possible");
		}
		else
		{
			System.out.print("Enter the element = ");
			ele = sc.nextInt();
			++top;
			s[top] = ele;
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("pop not possible");
		}
		else
		{
			System.out.print("Element deleted is = "+s[top]);
			--top;
		}
	}
	public void display() {
		if(top == -1) {
			System.out.println("Display not possible");
		}else {
			for(int i=top;i>=0;i--) {
				System.out.print(s[i]+" ");
			}
		}
	}
}