package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.entities.Employee;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Employee e1 = (Employee) context.getBean("emp");
		System.out.println(e1);
	}
}