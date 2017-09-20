package com.atos.java.hibernate;

public class Person {
	
	private int code;
	private String name;
	private Spouse s;
	
	
	public Person(int code, String name, Spouse s) {
		super();
		this.code = code;
		this.name = name;
		this.s = s;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Spouse getS() {
		return s;
	}
	public void setS(Spouse s) {
		this.s = s;
	}
	
	

}
