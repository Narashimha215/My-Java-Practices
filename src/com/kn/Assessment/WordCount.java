package com.kn.Assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	String[] words;

	public static void main(String[] args) throws IOException {
		String file = "assignment1.txt";
		int maxLength = 0;
		try(BufferedReader bf = new BufferedReader(new FileReader(file))){
			String line;
			String[] words;
			while((line=bf.readLine()) != null) {
				words = line.split("\\s+");
				maxLength += words.length;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(maxLength);
	}
}