package com.rakesh.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.rakesh.model.Samosa;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/rakesh/cfg/Spring.xml");
		Samosa s=(Samosa) context.getBean("s");
		System.out.println(s);
		context.registerShutdownHook();
		
	}
}
