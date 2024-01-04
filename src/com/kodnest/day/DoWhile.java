package com.kodnest.day;
public class DoWhile 
{
	public static void main(String[] args) 
	{
//		int a= 100;
//		do
//		{
//			System.out.println("Doing a set of exercises. Current energy: "+a);
//			a-=30;
//		}while(a>0);
//		
//		int b= 0;
//		while(b<5) 
//		{
//			b++;
//			System.out.println("Goal Scored! Total goals: "+b);
//		}
//		System.out.println("Training completed.Total goals scored: "+b);
//		
//		String[] book = {"Chapter 1","Chapter 2","Chapter 3","Chapter 4","Chapter 5"};
//		String str = "Chapter 3";
//		for(String chapter : book)
//		{
//			if(chapter.equals(str))
//			{
//				System.out.println("Found "+str);
//				break;
//			}
//			System.out.println("Fliping through "+chapter);
//		}
		
//		while(true)
//		{
//			System.out.println("Done");
//		}
		
//		String[] grades = {"Grade 1","Grade 2","Grade 3"};
//		String[] stu = {"Student A","Student B","Student C"};
//		for(String grade:grades)
//		{
//			System.out.println("Entering "+grade);
//			for(String student : stu)
//			{
//				System.out.println("Giving candy to : "+student);
//			}
//		}
		
//		outer : for(int i=0; i<5; i++)
//		{
//			inner : for(int j=0;j<5;j++)
//			{
//				if(j==2)
//				{
//					break outer;
//				}
//				System.out.println("i: "+i+" +j: "+j);
//			}
//		}
		
		String weather = "hot";
		String outfit = (weather.equals("hot")) ? "shorts" : "pants";
		System.out.println(outfit);
	}
}