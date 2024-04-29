package com.rakesh.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakesh.bean.OutputHelper;

public class App {
	
	    private static ApplicationContext context;
		public static void main(String[] args) {
			 context = new ClassPathXmlApplicationContext("com/rakesh/cfg/Spring.xml");
			 OutputHelper out = (OutputHelper) context.getBean("output");
			 out.getOutputGenerator();
		}
}
