package com.kn.hashSet;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(55);
		set.add(44);
		set.add(33);
		set.add(22);
		set.add(11);
		System.out.println(set);
	}
}