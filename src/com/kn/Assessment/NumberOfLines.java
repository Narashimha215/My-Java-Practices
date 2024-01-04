package com.kn.Assessment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfLines {

	public static void main(String[] args) throws IOException {
		File file = new File("./assignment1.txt");
		if(!file.exists())
			file.createNewFile();
		int count=0;
		FileReader fr = new FileReader(file);
		try (BufferedReader br = new BufferedReader(fr)) {
			while(br.readLine()!= null) {
				count++;
			}
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			System.out.println("The number of lines in a file = "+count);
		}
	}
}