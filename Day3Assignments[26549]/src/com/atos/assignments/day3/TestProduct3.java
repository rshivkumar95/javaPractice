package com.atos.assignments.day3;

public class TestProduct3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product3 p=new Product3("Remote Car",340.00,'T');
		System.out.println(p.getProductDetails());
		Product3 p1=new Product3("Mobile",7500.00);
		System.out.println(p1.getProductDetails());
		Product3 p2=new Product3("Laptop",26000.00);
		System.out.println(p2.getProductDetails());
		

	}

}

/* Code - T100, Name - Remote Car, Price - 340.0, Category - T
Code - E101, Name - Mobile, Price - 7500.0, Category - E
Code - E102, Name - Laptop, Price - 26000.0, Category - E */
