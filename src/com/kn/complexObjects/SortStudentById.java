package com.kn.complexObjects;

import java.util.*;

public class SortStudentById implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		if(s1.getId() > s2.getId()) {
			return 1;
		}
		else if(s1.getId() < s2.getId()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
