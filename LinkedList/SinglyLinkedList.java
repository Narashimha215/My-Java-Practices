package LinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
	class Node 
	{
		int data;
		Node link;
	}
	private Node first;
	private Scanner sc = new Scanner(System.in);
	public void insertrear() 
	{
		Node temp;
		System.out.print("Enter an element = ");
		int ele = sc.nextInt();
		Node newnode = 	new Node();
		newnode.data = ele;
		newnode.link = null;
		if(first==null)
		{
			first = newnode;
		}
		else
		{
			temp=first;
			while(temp.link!=null) {
				temp=temp.link;				
			}
			temp.link=newnode;
		}	
	}
	public void deleterear() 
	{
		Node temp;
		if(first==null)
		{
			System.out.println("Deletion not possible");
		}
		else if(first.link==null)
		{
			System.out.println("Element deleted is = "+first.data);
			first = null;
		}
		else
		{
			temp=first;
			while(temp.link.link!=null) {
				temp=temp.link;				
			}
			System.out.println("Element deleted is = "+temp.link.data);
			temp.link=null;
		}
	}
	public void insertfront() 
	{
		System.out.print("Enter an element = ");
		int ele = sc.nextInt();
		Node newnode = 	new Node();
		newnode.data = ele;
		newnode.link = null;
		if(first==null)
		{
			first = newnode;
		}
		else
		{
			newnode.link = first;
			first=newnode;
		}	
	}
	public void deletefront() 
	{
		if(first==null)
		{
			System.out.println("Deletion not possible");
		}
		else if(first.link==null)
		{
			System.out.println("Element deleted is = "+first.data);
			first = null;
		}
		else
		{
			System.out.println("Element deleted is = "+first.data);
			first = first.link;
		}
	}
	public void display() 
	{
		Node temp;
		if(first==null)
		{
			System.out.println("Display not possible.");
		}
		else if(first.link==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.link;				
			}
			System.out.println();
		}	
	}
}