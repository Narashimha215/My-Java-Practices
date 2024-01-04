package com.kn.CollectionPractice;
import java.util.*;
public class ArrayListCol {
	public static void main(String[] args) {
//		ArrayList<Integer> all = new ArrayList<>();
		Object arr[] = new Object[] {1,5,8,9,2};
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList<Integer> all = new ArrayList(Arrays.asList(arr));
		all.add(5);
//		all.add(0,8);
//		all.add(5);
//		all.add(0,8);
//		all.add(5);
//		all.add(0,8);
//		all.add(5);
//		all.add(0,8);
//		all.add(5);
//		all.add(0,8);
//		
//		all.add(5);
//		all.add(0,8);
//		all.add(5);
//		all.add(0,8);
//		all.add(5);
//		all.add(0,8);
		System.out.println(all);
		System.out.println(all.size());
		System.out.println(all.get(2));
		
//		all.remove(0);
//		System.out.println(all);
		all.set(0,25);
		System.out.println(all);
		
//		for(int i=0;i<all.size();i++) {
//			System.out.println(all.get(i)+" ");
//		}
		
		for(Integer in:all) {
			System.out.print(in+" ");
		}
		Collections.synchronizedList(all);//indirectly vector
	}
}
/*ArrayList :
 * default capacity= 0
 * Initial capacity = 10
 * Does it allow duplicate elements = Yes
 * Does it allow null values = Yes
 * Does it Maintain the insertion order = Yes
 * Does it Maintain the sorted order = No
 * Does it offer the random access of elements = Yes
 * Is it synchronised = No
 * What is it good at = only store and retrieve the data is best for ArrayList
 */