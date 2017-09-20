package com.atos.assignments.day4_1_1;

public class testCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c=new Customer();
		Address a=new Address("Hingoli Road","Nanded");
		c.setCustomerName("Shivkumar");
		c.setResidentAddress(a);
		System.out.println(":: Using Getter Setter ::");
		System.out.println("Customer Name : "+c.getCustomerName());
		System.out.println("Resident Address : "+c.getResidentAddress().getAddressLine()+", "+c.getResidentAddress().getCity());
		
	
		Address a1=new Address("Parbhani Road","Nanded");
		Customer c1=new Customer("Shivkumar",a1);
		System.out.println(":: Using getCustomerDetails() ::");
		System.out.println(c1.getCustomerDetails());
	
	}

}

/* 

:: Using Getter Setter ::
Customer Name : Shivkumar
Resident Address : Hingoli Road, Nanded
:: Using getCustomerDetails() ::
Customer :Shivkumar
Residential Address :Parbhani Road, Nanded

*/
