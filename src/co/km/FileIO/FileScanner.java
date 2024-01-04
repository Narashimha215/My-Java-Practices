package co.km.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int a = sc.nextInt();
		System.out.println("Your number is = "+a);
		try {
			String path1 = "C:\\io\\inputs.txt";
			String path2 = "C:\\io\\outputs.txt";
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			String y;
			while((y=br.readLine())!=null) {
				bw.write(y);
			}
			fw.flush();   // some times the output not comes fully but by using flush()method the output comes fully and correctly
			br.close();
			bw.close();
			fr.close();
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}