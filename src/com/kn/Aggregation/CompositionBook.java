package com.kn.Aggregation;

public class CompositionBook 
{
	public static void main(String[] args) 
	{
		Book book1 = new Book("Page #1 has introduction");
		book1.readBook();
		book1 = null;
		//After deleting book page doesn't exist anymore.
		
	}
}