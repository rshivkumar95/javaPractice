package com.atos.assignments.day4_1_3;

public class testCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c=new Customer();
		Address a=new Address("Ist Main HSR Layout","Bangalore");
		Address a1=new Address("Ist Main Electronics city","Bangalore");
		Customer c1=new Customer("Shivkumar",a,a1);
		System.out.println(":: Using getCustomerDetails() ::");
		System.out.println(c1.getCustomerDetails());
	
	}

}

/* 

:: Using getCustomerDetails() ::
Customer :Shivkumar
Residential Address :Ist Main HSR Layout,Bangalore
Official Address :Ist Main Electronics city,Bangalore

*/
