package kn.com.objects2;

import java.util.Scanner;

public class StudentUtillity 
{
	public static Student[] studentObjectCreation(int n)
	{
		Scanner scan = new Scanner(System.in);
		Student srr[] = new Student[n];
		for(int i=0;i<srr.length;i++)
		{
			System.out.println("Data for Student = "+(i+1));
			System.out.println("Enter Id = ");
			int id = scan.nextInt();
			System.out.println("Enter Name = ");
			String name = scan.next();
			System.out.println("Enter Marks = ");
			int marks = scan.nextInt();
			srr[i] = new Student(id,name,marks);
		}
		scan.close();
		return srr;
	}
	
	public static int searchStudentById(Student srr[], int id) 
	{
		int index = -1;
		int low = 0,high = srr.length-1,mid = 0;
		while(low <= high) 
		{
			mid = (low + high)/2;
			if(srr[mid].id == id)
			{
				index = mid;
				return index;
			}
			else if(srr[mid].id > id)
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		return index;
	}
	
	public static int searchStudentByName(Student[] srr, String name) 
	{
		int index = -1;
		int low = 0,high = srr.length-1,mid = 0;
		while(low <= high) {
		mid = (low + high)/2;
		if(srr[mid].name.equalsIgnoreCase(name))
		{
			index = mid;
			return index;
		}
		else if(srr[mid].name.compareTo(name)>0)
		{
			high = mid-1;
		}
		else
		{
			low = mid+1;
		}
		}
		return index;
	}

	public static Student[] sortStudentByIdASC(Student[] srr) {
		Student temp=null;
		boolean isSwapped = false;
		for(int i=0;i<srr.length-1;i++)
		{
			for(int j=0;j<srr.length-1-i;j++)
			{
				if(srr[j].id > srr[j+1].id)
				{
					temp = srr[j];
					srr[j] = srr[j+1];
					srr[j+1]=temp;
					isSwapped = true;
				}
			}
			if(isSwapped == false)
			{
				break;
			}
		}
		return srr;
	}
}