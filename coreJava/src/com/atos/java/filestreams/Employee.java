package com.atos.java.filestreams;

import java.io.Serializable;

public class Employee implements Serializable{

	
	private int empid;
	transient String ename;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	

}
