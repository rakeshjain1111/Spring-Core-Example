package com.rakesh.model;

public class Student {
  private int id;
  private String name;
  private String Address;

public Student(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	Address = address;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", Address=" + Address + "]";
}
  
  
}
