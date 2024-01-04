package co.km.FileIO;

import java.io.*;

public class FileInputOutput {

	public static void main(String[] args) {
		try {
			String path1 = "C:\\io\\input.txt";
			String path2 = "C:\\io\\output.txt";
//			FileInputStream fis = new FileInputStream(path1);
//			FileOutputStream fos = new FileOutputStream(path2);
//			int x;
//			while((x=fis.read())!=-1) {
//				fos.write(x);
//			}
//			fis.close();
//			fos.close();
			
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			int y;
			while((y=fr.read())!=-1) {
				fw.write(y);
			}
			fw.flush();   // some times the output not comes fully but by using flush()method the output comes fully and correctly
			fr.close();
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}