package com.atos.java.test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestOrder {

	
	public static void main(String[] args) throws InvalidStatusException {
		// TODO Auto-generated method stub
	
		Customer c=new Customer(101,"Shivkumar");
		Order o1=new Order(1001,"COD","Mobile");
		Order o2=new Order(1002,"NEFT","Laptop");
		c.addNewOrder(o1);
		c.addNewOrder(o2);
		
		Customer c1=new Customer(103,"Shivkumar33");
		Order o3=new Order(1003,"COD1","Mobile1");
		Order o4=new Order(1004,"NEFT1","Laptop2");
		c.addNewOrder(o3);
		c.addNewOrder(o4);
		
		ArrayList<Order> li=c.getOrderList();
		Iterator<Order> it=li.iterator();
		System.out.println();
		while(it.hasNext())
		{
			Order o=it.next();
			System.out.println(o.getOrderID()+" "+o.getOrderType()+" "+o.getOrderDescription());
		}
		
		li=c.getOrderList();
		it=li.iterator();
		System.out.println();
		while(it.hasNext())
		{
			Order o=it.next();
			System.out.println(o.getOrderID()+" "+o.getOrderType()+" "+o.getOrderDescription());
		}
		
		c.changeOrderStatus(1002, "Closed");
		
		li=c.getOrderList();
		it=li.iterator();
		System.out.println();
		while(it.hasNext())
		{
			Order o=it.next();
			System.out.println(o.getOrderID()+" "+o.getOrderType()+" "+o.getOrderDescription()+" "+o.getOrderStatus());
		}
		
		
		
		

	}

}
