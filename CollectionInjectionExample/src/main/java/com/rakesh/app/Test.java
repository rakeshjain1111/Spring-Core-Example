package com.rakesh.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakesh.model.Student;

import org.springframework.context.ApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rakesh/cfg/Spring.xml");
		Student s=(Student) context.getBean("stu");
		System.out.println(s.getName());
		System.out.println(s.getAddresses());
		System.out.println(s.getCourses());
		System.out.println(s.getPhones());
	}
}
