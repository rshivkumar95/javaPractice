package com.atos.java.classess;

public class constructorOverloading {
	
	public constructorOverloading(int a,int b)
	{
		System.out.println(a+b);
	}
	public constructorOverloading(String a,String b)
	{
		System.out.println(a+b);
	}
	public constructorOverloading(Double a,Double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		new constructorOverloading(12,20);
		new constructorOverloading(12.5,20.5);
		new constructorOverloading("Pratik ","Jagtap");
		

	}

}
