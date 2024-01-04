package com.kn.FileHandling;

import java.io.*;

public class WritingFile {

	public static void main(String[] args) throws IOException {
		File file = new File("./resume.txt");
//		if(file.exists()) {
//			file.delete();
//		}
//		file.createNewFile();
		//1. FileOutputStream
//		FileOutputStream fos = new FileOutputStream(file);
//		fos.write(72);
//		fos.write(69);
//		fos.write(76);
//		fos.write(76);
//		fos.write(79);
//		fos.flush();
		
//		String s = "hello";
//		FileOutputStream fos = new FileOutputStream(file);
//		for(char ch : s.toCharArray())
//			fos.write((int)ch);
//		fos.flush();
//		fos.close();
		
		//2. FileWriter
//		String s = "hello";
//		FileWriter fw = new FileWriter(file);
//		fw.write(s.toCharArray());
//		fw.flush();
//		fw.close();
		
		//3. BufferedWriter
//		String s = "Narashimha reddy";
//		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//		bw.write(s);
//		bw.flush();
//		bw.close();
		
		String existingText = new String();
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(file));
		while((line = br.readLine()) !=  null) {
			existingText += line +"\n";
		}
		br.close();
//		String s = "How are you";
		String s = "what are you doing";
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//		bw.write(s);
		bw.write(existingText+s);
		bw.flush();
		bw.close();
	}
}