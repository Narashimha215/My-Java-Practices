package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.bean.Laptop;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Laptop l1 = (Laptop) context.getBean("l1");
		Laptop l2 = (Laptop) context.getBean("l2");
		System.out.println("Laptop one added ====>"+l1);
		System.out.println("Laptop two added ====>"+l2);
	}
}