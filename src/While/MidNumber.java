package While;

import java.util.Scanner;

public class MidNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Element=");
		int element = scan.nextInt();
		int arr[] = {10,20,25,30,40,45,50,60,70,80,90};
		int position= -1;
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		boolean isElementFound = false;
		while(low <= high)
		{
			mid = (low+high)/2;
			if(element == arr[mid])
			{
				isElementFound = true;
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
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element Found at = "+position);
		}
		scan.close();
	}
}