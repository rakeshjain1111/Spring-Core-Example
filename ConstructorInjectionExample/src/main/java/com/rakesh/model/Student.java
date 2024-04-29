package com.rakesh.model;

public class Student {
  private String id;
  private String name;
  private String Address;
  private int age;

  	public Student(String id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.Address = address;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + ", age=" + age + "]";
	}


  
  
}
