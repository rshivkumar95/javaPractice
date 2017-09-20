package com.atos.java.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {

	private int customerID;
	private String customerName;
	private ArrayList<Order> li=new ArrayList<Order>();
	
	public Customer(int customerID,String customerName)
	{
		this.customerID=customerID;
		this.customerName=customerName;
		
	}
	
	public void addNewOrder(Order o)
	{
		li.add(o);
	}
	
	public ArrayList<Order> getOrderList()
	{
		return li;
	}
	
	public void changeOrderStatus(int orderID,String status) throws InvalidStatusException
	{
		Order o;
	   Iterator<Order> it=li.iterator();
	   while(it.hasNext())
	   {
		   o=it.next();
		   if(o.getOrderID()==orderID)
		   {
			   o.setOrderStatus(status);
			   break;
		   }
	   }
	}

}
