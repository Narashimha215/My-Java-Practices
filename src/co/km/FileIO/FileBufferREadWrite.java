package co.km.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileBufferREadWrite {

	public static void main(String[] args) {
		try {
			String path1 = "C:\\io\\input.txt";
			String path2 = "C:\\io\\output.txt";
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
	}
}