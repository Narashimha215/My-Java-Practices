package com.kn.CollectionPractice;

import java.util.*;
import java.util.Map.Entry;

public class MapColl {

	public static void main(String[] args) {	
		//List<String> l = new ArrayList<>();
		//Creation of a map
		Map<Integer, String> mp = new HashMap<>();
//		Map<Integer, String> mp1 = new Hashtable<>();
//		Map<Integer, String> mp2 = new LinkedHashMap<>(); //Use any one in the 4 classes
//		Map<Integer, String> mp3 = new TreeMap<>();
		// Addition of elements into the map
		mp.put(123, "Narashimha");
		mp.put(456, "Ganesh");
		mp.put(789, "Siva");
		System.out.println(mp);
		//Retrieval of keys from the map
		Set<Integer> keys = mp.keySet();
		for (Integer key : keys) {
			System.out.println(key);  //or
		}
		System.out.println(mp.keySet());
		//Retrieval of values from the map
		Collection<String> values = mp.values();
		for (String value : values) {
			System.out.println(value);   //or
		}
		System.out.println(mp.values());
		
		//Retrieval of values from the map based on a key
		System.out.println(mp.get(123));
		
		//Deletion of element from the map
//		mp.remove(456);
//		System.out.println(mp);
		// Verification of key in a map
		System.out.println(mp.containsKey(123));
		System.out.println(mp.containsKey(143));
		// Verification of value in a map
		System.out.println(mp.containsValue("Siva"));
		System.out.println(mp.containsValue("kadapa"));
		mp.replace(456,"Sidhu");
		System.out.println(mp);
				
		Set<Entry<Integer, String>> entries = mp.entrySet();
		for (Entry<Integer, String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"=====>"+value);
		}
		
		mp.clear();
		System.out.println(mp);
	}
}