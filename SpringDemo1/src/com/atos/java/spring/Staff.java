package com.atos.java.spring;

public class Staff {
	
	private int staffid;
	private String name;
	private Address ad;
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	
	public void display()
	{
		System.out.println(this.staffid+"\t"+this.name+"\t"+ad.toString());
	}
	

}
