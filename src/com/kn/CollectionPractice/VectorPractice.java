package com.kn.CollectionPractice;

import java.util.*;

public class VectorPractice {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add("Narashimha");
		v1.add("Ganesh");
		v1.add(0,"Siva");
		v1.add("Mali");
		
		Vector v2 = new Vector(20);
		v2.add("Sidhu");
		v2.add("Sanny");
//		v1.add("Dhanu");
//		v1.add("vishnu");
//		v1.add("Sai");
		System.out.println(v1);
		
//		for(int i=0;i<v2.size();i++) {
//			v1.add(v2.get(i));
//		}
//		v1.addAll(v2);
		v1.addAll(0,v2);
		
//		v1.add("Reddy");
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
		System.out.println(v1);
		
		//System.out.println(v1.get(2));
//		v1.remove(0);
//		System.out.println(v1);
//		
//		v1.remove("Mali");
//		System.out.println(v1);
		
//		v1.removeAll(v2);
//		System.out.println(v1);
		
//		v1.clear();
//		System.out.println(v1);
		
//		System.out.println(v1.contains("Siva"));
		
//		v1.set(1, "Ram");
//		System.out.println(v1);
//		System.out.println(v1.get(1));
//		
////		System.out.println(v1.indexOf("Siva"));
//		System.out.println(v1.lastIndexOf("Siva"));
//		
//		System.out.println(v1.firstElement());
//		System.out.println(v1.lastElement());
		
//		Object arr[] = v1.toArray();
//		System.out.println(Arrays.toString(arr));
		
		//Vector java 1.0
		//collection 1.2
		//Generics 1.5
		Object arr[] = new Object[] {1,5,8,9,2};
		Vector v3 = new Vector(Arrays.asList(arr));
		Vector<Integer> v4 = new Vector();
		Vector<Integer> v5 = new Vector<Integer>();
		
		v3.add("Obul");
		v4.add(5);
	//	v4.add("Obul"); Error
		v4.add(null);
		int sum =0;
		for(int i=0;i<v3.size();i++) {
			sum += (Integer) v1.get(i);
		}
		System.out.println(v3);
		System.out.println(v3.size());
		System.out.println(v3.capacity());
	}
}
/*Vector :
 * default capacity= 10
 * Initial capacity = 10
 * Does it allow duplicate elements = Yes
 * Does it allow null values = Yes
 * Does it Maintain the insertion order = Yes
 * Does it Maintain the sorted order = No
 * Does it offer the random access of elements = Yes
 * Is it synchronised = Yes
 * What is it good at = Multi threading, data is increased exponentially
 */
