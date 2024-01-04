package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.entities.Person;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}	
}