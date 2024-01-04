package com.kodnest.day;
import java.util.Arrays;
public class Anagram
{
    public static boolean areAnagrams(int num1, int num2) {
        // Convert numbers to strings
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);
        
        // Check if the lengths are different, if so, they cannot be anagrams
        if (strNum1.length() != strNum2.length()) {
            return false;
        }
        
        // Convert strings to char arrays and sort them
        char[] charArray1 = strNum1.toCharArray();
        char[] charArray2 = strNum2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        int num1 = 12345;
        int num2 = 54321;
        
        if (areAnagrams(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are anagrams.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not anagrams.");
        }
    }
}