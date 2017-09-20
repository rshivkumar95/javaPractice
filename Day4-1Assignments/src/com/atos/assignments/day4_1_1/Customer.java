package com.atos.assignments.day4_1_1;

public class Customer {
	
	private String customerName;
	private Address residentAddress;
	
	Customer()
	{
		
	}

	public Customer(String customerName, Address residentAddress) {
		super();
		this.customerName = customerName;
		this.residentAddress = residentAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
	public Address getResidentAddress() {
		return residentAddress;
	}

	public void setResidentAddress(Address residentAddress) {
		this.residentAddress = residentAddress;
	}

	public String getCustomerDetails()
	{
		return "Customer :"+this.getCustomerName()+"\nResidential Address :"+residentAddress.getAddressDetails();
	}

}
