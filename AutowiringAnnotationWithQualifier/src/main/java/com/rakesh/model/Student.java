package com.rakesh.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
  private int id;
  private String name;
  
  @Autowired
  @Qualifier("add2")
  private Address add;

  
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Address getAdd() {
	return add;
}


public void setAdd(Address add) {
	this.add = add;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
}

  
}
