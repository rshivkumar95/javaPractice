package com.atos.java.interfacedemo;

public class DemoClass implements DemoInterface {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Implemented here, Display");

	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("Implemented Here, Show");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoClass s=new DemoClass();
		s.display();
		s.show();

	}

	

}
