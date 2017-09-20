package com.atos.java.spring;

public class Employee {
	
	int empno;
	String ename;
	
	public Employee()
	{
		System.out.println("Cons Defined");
	}
	
	public Employee(int id)
	{
		this.empno=id;
	}
	
	public Employee(String name)
	{
		this.ename=name;
	}

	public Employee(int id, String name) 
	{
		this.empno = id;
		this.ename = name;
	}
	
	
	void show(){
		System.out.println("ID ::"+empno+"\tName ::"+ename);
	}
	
	

}
