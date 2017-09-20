package com.atos.assignments.day3;

public class Product3 {

	private String productCode;
	private String productName;
	private double productPrice;
	char categoryCode;
	static int prodCounter=100;
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
	public char getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	private String generateProductCode()
	{
		return (categoryCode+""+(prodCounter++));
	}
	
	public Product3(String productName,Double productPrice,char categoryCode)
	{
		this.productPrice=productPrice;
		this.productName=productName;
		this.categoryCode=categoryCode;
		this.productCode=generateProductCode();
		
	}
	
	public Product3(String productName,Double productPrice)
	{
		this.productPrice=productPrice;
		this.productName=productName;
		this.categoryCode='E';
		this.productCode=generateProductCode();
	}
	
	public String getProductDetails()
	{
		return "Code - "+this.productCode+", Name - "+this.productName+", Price - "+this.productPrice+", Category - "+this.categoryCode;
	}
	
	
}
