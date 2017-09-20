package com.atos.java.spring;

public class Student {
	
	private int rollno;
	private String name;
	private Subject sbs;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSbs() {
		return sbs;
	}
	public void setSbs(Subject sbs) {
		this.sbs = sbs;
	}
	
	public void display()
	{
		System.out.println(this.rollno+"\t"+this.name+"\t"+sbs.toString());
	}

}
