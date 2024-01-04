package While;

import java.util.Scanner;

public class MidNumber1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size=");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the element"+(i+1)+"= ");
			arr[i]=scan.nextInt();
		}
		System.out.print("Enter the element = ");
		int element = scan.nextInt();
		int position=-1;
		int low =0;
		int high = arr.length-1;
		int mid =0;
		boolean isElementFound = false;
		while(low <= high)
		{
			mid = (low+high)/2;
			if(element == arr[mid])
			{
				isElementFound=true;
				position = mid+1;
				break;
			}
			else if(element>arr[mid])
			{
				low = mid+1;
				//high = high;
			}
			else
			{
				high = mid-1;
				//low = low;
			}
		}
		if(isElementFound==false)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println(" Element Found at = "+position);
		}
		scan.close();
	}
}