package com.kn.maps;

import java.util.HashMap;

public class HashMapDemo1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
			@SuppressWarnings("rawtypes")
			HashMap map1 = new HashMap<>();
			map1.put(1,100);
			map1.put(2,500);
			map1.put("Three",new StudentT(1,"Reddy",500));
			map1.put("Four",500); 
			map1.put(5,"5555");
			System.out.println(map1);
	}
}