package com.atos.java.interfacedemo;

public class Multiple implements First, Second {

	
	@Override
	public void Wish() {
		// TODO Auto-generated method stub
		
		System.out.println("Happy Ganpathy Pooja");
		
	}

	@Override
	public int product(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
			System.out.println("Hello ! Enjoy Your Holiday");
	}

	@Override
	public void hai() {
		// TODO Auto-generated method stub
	 System.out.println("Hai Happy Holiday");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiple m=new Multiple();
		m.hai();
		m.hello();
		m.Wish();
		System.out.println("The Product is :"+m.product(5, 6));
		
		System.out.println(m instanceof First);
		System.out.println(m instanceof Second);
		System.out.println(m instanceof Multiple);
		

	}

	
}
