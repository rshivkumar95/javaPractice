package com.atos.assignments.day3;


class Product1{

	public String productCode;
	public String productName;
	public double productPrice;
	
	
	
}


public class TestProduct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product1 p1=new Product1();
		System.out.println("Product Code ::"+p1.productCode);
		System.out.println("Product Name ::"+p1.productName);
		System.out.println("Product Price ::"+p1.productPrice);
		
	
		Product1 p=new Product1();
		p.productCode="P1001";
		p.productName="Laptop";
		p.productPrice=30000.00;
		
		System.out.println("Product Code ::"+p.productCode);
		System.out.println("Product Name ::"+p.productName);
		System.out.println("Product Price ::"+p.productPrice);
	}

}

/* 
  
Product Code ::null
Product Name ::null
Product Price ::0.0
Product Code ::P1001
Product Name ::Laptop
Product Price ::30000.0

*/