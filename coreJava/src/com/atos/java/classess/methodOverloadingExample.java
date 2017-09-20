package com.atos.java.classess;

public class methodOverloadingExample {
	
	public int sum(int x,int y,int z)
	{
		return x+y+z;
	}
	
	public double sum(double p,double q,double r)
	{
		return p+q+r;
	}
	
	public String sum(String p,String q)
	{
		return p+q;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodOverloadingExample m=new methodOverloadingExample();
		System.out.println("Sum of Integers ::"+m.sum(12, 10, 90));
		System.out.println("Sum of Doubles :: "+m.sum(12.6, 13.9, 15.9));
		System.out.println("Sum of String :: "+m.sum("Pratik","Jagtap"));

	}

}
