package com.kn.pojoJavaBean;

public class ProgrameBean {

	public static void main(String[] args) {
		StudentJavaBean s = new StudentJavaBean();
		s.setId(101);
		s.setName("Narashimha");
		s.setSalary(200000);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getSalary());
	}
}