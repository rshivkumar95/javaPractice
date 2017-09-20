package com.atos.java.spring;

public class Customer {
	
	private int custcode;
	private String name;
	public int getCustcode() {
		return custcode;
	}
	public void setCustcode(int custcode) {
		this.custcode = custcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(this.custcode+"\t"+this.name);
	}

}
