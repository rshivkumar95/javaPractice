package com.atos.java.spring;

public class Address {
	
	private String addressLine;
	private String city;
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address is" + addressLine + ", " + city;
	}
	
	
	

}
