package com.rakesh.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakesh.model.Student;

import org.springframework.context.ApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rakesh/cfg/Spring.xml");
		Student s=(Student) context.getBean("s");
		System.out.println(s);
		
	}
}
