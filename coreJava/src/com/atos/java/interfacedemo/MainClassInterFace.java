package com.atos.java.interfacedemo;

public class MainClassInterFace implements Interface1 {

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello !");

	}

	@Override
	public void computer(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Sum :" +(x+y));
		System.out.println("Substraction :" +(x-y));
		System.out.println("Product :" +(x*y));
		System.out.println("Division :" +(x/y));
		System.out.println("Modulus :" +(x%y));


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MainClassInterFace m=new MainClassInterFace();
			m.greet();
			m.computer(10, 5);
			
			System.out.println(m instanceof Interface1);
	}

}
