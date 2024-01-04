package com.kn.pojoJavaBean;

public class Programepojo {

	public static void main(String[] args) {
		EmployePOJO ep = new EmployePOJO();
		ep.setId(101);
		ep.name = "Narashimha reddy";
		ep.salary =200000;
		
//		System.out.println(ep.getId());
//		System.out.println(ep.name);
//		System.out.println(ep.salary);
		
		EmployePOJO ep1 = new EmployePOJO();
		ep1.setId(101);
		ep1.name = "Ganesh reddy";
		ep1.salary =100000;
		
		EmployePOJO ep2 = new EmployePOJO();
		ep2.setId(101);
		ep2.name = "siva reddy";
		ep2.salary =300000;
		EmployePOJO[] emp = new EmployePOJO[] {ep1,ep2,ep};
	}
}