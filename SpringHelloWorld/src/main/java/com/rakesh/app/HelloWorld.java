package com.rakesh.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakesh.bean.Hello;

public class HelloWorld {
   public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
	Hello obj =(Hello) context.getBean("helloBean");
	obj.display();
}
}
