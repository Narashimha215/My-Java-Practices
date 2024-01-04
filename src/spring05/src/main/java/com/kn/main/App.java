package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.entities.Trainer;
import com.kn.entities.University;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		University un = (University) context.getBean("university");
		System.out.println(un);
		Trainer tn = (Trainer) context.getBean("trainer1");
		System.out.println(tn);
	}
}