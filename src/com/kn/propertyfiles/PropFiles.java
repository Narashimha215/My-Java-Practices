package com.kn.propertyfiles;

import java.io.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class PropFiles {

	public static void main(String[] args) throws IOException {
		File file = new File("dbConfig.properties");
		if(file.exists()) {
			file.createNewFile();
		}
	//	System.out.println(file.exists());
//		file.delete();
//		System.out.println(file.exists());
		Properties prop = new Properties();
//		prop.setProperty("url", "localhost");
//		prop.setProperty("username", "Narashimha");
//		prop.setProperty("password", "Reddy@123");
//		FileOutputStream fos = new FileOutputStream(file);
//		prop.store(fos, "New prop file is created");
	//	FileInputStream fis = new FileInputStream(file);
		FileReader fis = new FileReader(file);
		prop.load(fis);
		prop.remove("url");
		FileWriter fos = new FileWriter(file);
		prop.store(fos, "New prop file is created");
	//	Set<String> keys = prop.stringPropertyNames();
//		Set<Object> keys = prop.keySet();
//		System.out.println(keys);
//		Collection<Object> c = prop.values();
//		System.out.println(c);
//		System.out.println(prop.getProperty("Machine", "lenovo"));
//		System.out.println(prop);
//		Collection<Object> c = prop.values();
//		for(Object key: prop.keySet()) {
//			System.out.println(key+" >>>>>"+prop.get(key));
//	    }
		
//		Set<Entry<Object, Object>> data = prop.entrySet();
//		for(Entry<Object, Object> entry:data) {
//			System.out.println(entry.getKey()+" >>>>> "+);
//		}
	}
}