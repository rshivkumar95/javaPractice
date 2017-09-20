package com.atos.assignments.day3;


class Product2{

	private String productCode;
	private String productName;
	private double productPrice;
	
	
	public Product2(String productCode, String productName, double productPrice) {
		
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public void display()
	{
		System.out.println("Product Code :" + this.productCode);
		System.out.println("Product Name :" + this.productName);
		System.out.println("Product Price :" + this.productPrice);
	}
	
	
}


public class TestProduct2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product2 p=new Product2("P1001","Laptop",30000.00);
		p.display();
		
		
	}

}

/* 
  
Product Code :P1001
Product Name :Laptop
Product Price :30000.0


*/