package com.rakesh.model;

public class Samosa {
	private int price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init Method");
	}
	
	public void destory() {
		System.out.println("Inside destory Method");
	}

}
