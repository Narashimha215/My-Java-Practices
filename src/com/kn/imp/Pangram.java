package com.kn.imp;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
        scanner.close();
    }
    public static boolean isPangram(String sentence) {
        // Create a boolean array to track the presence of each letter (a to z)
        boolean[] alphabetPresent = new boolean[26];

        // Convert the sentence to lowercase to make the check case-insensitive
        sentence = sentence.toLowerCase();

        // Iterate through the sentence and mark each letter's presence
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all letters are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }
        return true;
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("Enter a sentence = ");
//    	String str = sc.next();
//    	if(isPangram(str))
//    	{
//    		System.out.println("The sentence is a pangram.");
//    	}
//    	else
//    	{
//    		System.out.println("The sentence is not a pangram.");
//    	}
//    	sc.close();
//    }
//
//	private static boolean isPangram(String str) 
//	{
//		boolean[] b = new boolean[26];
//		str = str.toLowerCase();
//		for(int i=0; i<str.length();i++)
//		{
//			char ch = str.charAt(i);
//			if(ch>='a' && ch<='z')
//			{
//				b[ch-'a'] = true;
//			}
//		}
//		for(boolean present:b)
//		{
//			if(!present)
//			{
//				return false;
//			}
//		}
//		return true;
	}
}