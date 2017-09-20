package com.atos.assignments.day3;

class Product{

	private String productCode;
	private String productName;
	private double productPrice;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
}


public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p=new Product();
		p.setProductCode("P1001");
		p.setProductName("Laptop");
		p.setProductPrice(30000.00);
		
		System.out.println("Product Code ::"+p.getProductCode());
		System.out.println("Product Name ::"+p.getProductName());
		System.out.println("Product Price ::"+p.getProductPrice());
	}

}


/* 

Product Code ::P1001
Product Name ::Laptop
Product Price ::30000.0

*/
