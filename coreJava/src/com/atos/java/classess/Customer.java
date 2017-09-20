package com.atos.java.classess;

public class Customer {
	private int custID;
	private String custName;
	private int qty;
	private double price;
	
	public static int cal(int x,int y)
	{
		return x + y; 
	}
	
	public void custDetails(int x,String y)
	{
		custID=x;
		custName=y;
	}
	public double calculateBill(int x,double y)
	{
		qty=x;
		price=y;
		return qty*price;
	}
	public static void main(String[] args) {
		
		Customer c=new Customer();
		c.custDetails(1, "Pratik");
		double bill=c.calculateBill(5, 30);
		System.out.println("Cust ID ::" + c.custID+"\nCust Name:: " + c.custName + "\nQty ::"+c.qty+"\nPrice:: "+c.price +"\nBill:: "+bill);
		
		System.out.println("Sum :: " + cal(5,4));
		
	}

}
