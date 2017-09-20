package com.atos.java.spring1;

public class Employee {
	
	private int id;
	private String name;
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
	
	public void initialization()
	{
		System.out.println("Employee bean has been initialized");
	}
	
	public void destroy()
	{
		System.out.println("Employee bean has been destroyed");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

}
