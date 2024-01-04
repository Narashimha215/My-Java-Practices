package com.kn.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Programe2 {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists()) {
			file.createNewFile();
		}  // 1. FileInputStream
//		FileInputStream fl = new FileInputStream(file);
//		int asciiCode;
//		String text = new String();
//		while((asciiCode = fl.read()) != -1) {
//			text += String.valueOf((char)asciiCode);
//			System.out.print((char)asciiCode);
//		}
//		System.out.println();
//		System.out.println(text);
//		fl.close();
		//2. Scanner
//		Scanner sc = new Scanner(file);
//		while(sc.hasNext()) {
//			System.out.println(sc.nextLine());
//		}
		
//		Scanner sc = new Scanner(file);
//		String text = new String();
//		while(sc.hasNext()) {
//			text += sc.nextLine()+"\n";
//		}
//		System.out.println(text);
		
		FileInputStream fi = new FileInputStream(file);
		Scanner sc = new Scanner(fi);
		String text = new String();
		while(sc.hasNext()) {
			text += sc.nextLine()+"\n";
		}
		System.out.println(text);
		sc.close();
	}

}
