package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.bean.Cars;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Cars c1 = (Cars) context.getBean("c1");
		Cars c2 = (Cars) context.getBean("c2");
		Cars c3 = (Cars) context.getBean("c3");
		System.out.println("The car details are ="+c1);
		System.out.println("The car details are ="+c2);
		System.out.println("The car details are ="+c3);
	}
}