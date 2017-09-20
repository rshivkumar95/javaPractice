package com.atos.java.classess;

public class Employee {

	static String department="Account";
	private int empid;
	private String ename;
	public void assign(int x, String y)
	{
		empid=x;
		ename=y;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}

	public void display()
	{
		System.out.println("Employee No : "+empid);
		System.out.println("Employee Name : "+ename);
	}
	public static void main(String[] args) 
	{
	    
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.assign(1,"Shivkumar");
		e2.assign(2,"Pratik");
		
		e1.display();
		e2.display();
		
		System.out.println(e1.department);
		System.out.println(e2.department);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		Employee e3;
		e3=e2;
		System.out.println(e3.toString());
		
		
		
	

	}

}
