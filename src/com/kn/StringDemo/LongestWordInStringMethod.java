package com.kn.StringDemo;

public class LongestWordInStringMethod {

	public static void main(String[] args) 
	{
		String s1 = "I am learning strings in java";
        String lW = findLongestWord(s1);
        System.out.println("Longest word: " + lW);
    }

    public static String findLongestWord(String s) {
        String[] words = s.split(" ");
        String lWd = "";

        for (String w : words) {
            if (w.length() > lWd.length()) {
               lWd = w;
            }
        }

        return lWd;
	}

}
