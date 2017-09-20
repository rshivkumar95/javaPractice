package com.atos.java.hibernate;

public class Employee extends Departments {
	
	private String ename;
	private float salary;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float f) {
		this.salary = f;
	}
	
}
