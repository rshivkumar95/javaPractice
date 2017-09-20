package com.atos.java.classess;

public class Animal {

	protected String animalType;
	protected int maxAge;
	public Animal(String animalType, int maxAge) {
		
		this.animalType = animalType;
		this.maxAge = maxAge;
	}
	
	public void display()
	{
		System.out.println("Animal Type ::"+animalType);
		System.out.println("Animal Age  ::"+maxAge);
	}
	
}
