package com.atos.java.classess;

public class Product {
	
	private int productCode;
	private String productName;
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public static void main(String[] args) {
		
		Product p=new Product();
		p.setProductCode(1);
		p.setProductName("Pratik");
		
		System.out.println("Product Code "+ p.getProductCode()+ "\nProduct Name :"+p.getProductName());
	}
	

}
