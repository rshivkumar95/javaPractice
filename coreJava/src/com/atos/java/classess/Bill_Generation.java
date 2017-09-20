package com.atos.java.classess;

class Customer1{
	protected int custcode;
	protected String name;
	protected double order_value;
	protected void setDetails(int cc,String cn,double ov)
	{
		this.custcode=cc;
		this.name=cn;
		this.order_value=ov;
	}
	public void hello()
	{
		System.out.println("Welcome To Pratik General Store");
	}
}


public class Bill_Generation extends Customer1{

	public void mesg() {
		// TODO Auto-generated constructor stub
		System.out.println("Thank you ! Visit again");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bill_Generation ct=new Bill_Generation();
		ct.hello();
		ct.setDetails(101, "Pratik", 300);
		System.out.println("Our First Customer Details Are ::");
		System.out.println("Customer Code  :: "+ct.custcode);
		System.out.println("Customer Name  :: "+ct.name);
		System.out.println("Customer Order :: "+ct.order_value);
		ct.mesg();
		

	}

}
