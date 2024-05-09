package com.rakesh.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Jalebi implements InitializingBean , DisposableBean{
	private int price;

	public Jalebi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jalebi(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Set Price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jalebi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean Intilization");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean Destory");
		
	}
	
}
