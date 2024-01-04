package com.kn.Assessment;

import java.io.*;

public class LengthyFile {

	public static void main(String[] args) throws IOException{
		File file = new File("./assignment1.txt");
//		String file1 = "assignment1.txt";
		String longestLine = "";
		int maxLength =0;
		try(BufferedReader br = new BufferedReader(new FileReader(file))) 
		{
			String line;
			while((line = br.readLine())!= null) {
				if(line.length() > maxLength) {
					maxLength = line.length();
					longestLine = line;
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(longestLine);
		System.out.println(maxLength);
	}
}