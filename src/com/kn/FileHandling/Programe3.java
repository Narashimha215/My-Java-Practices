package com.kn.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programe3 {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists()) {
			file.createNewFile();
		} //3. File Reader
//		FileReader fr = new FileReader(file);
//		int asciiCode;
//		String text = new String();
//		while((asciiCode = fr.read()) != -1) {
//			text += String.valueOf((char)asciiCode);
//		//	System.out.print((char)asciiCode);
//		}
//		System.out.println(text);
//		fr.close();
		
		//4. BufferedReader
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//		String line = new String();
//		while((line = br.readLine()) != null) {
//			System.out.println(line);
//		}
		
		
//		BufferedReader br = new BufferedReader(fr);
//		String text = new String();
//		String line = new String();
//		while((line = br.readLine()) != null) {
//			text += line+"\n";
//		}
//		System.out.println(text);
		
		FileReader fr = new FileReader(file);
		FileInputStream fl = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fl);
		BufferedReader br = new BufferedReader(isr);
		String text = new String();
		String line = new String();
		while((line = br.readLine()) != null) {
			text += line+"\n";
		}
		System.out.println(text);
		br.close();
		fr.close();
	}
}
