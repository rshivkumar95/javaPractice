package com.atos.java.classess;

public class Forest extends Animal {

	public Forest(String animalType, int maxAge) {
		super(animalType, maxAge);
		// TODO Auto-generated constructor stub
		System.out.println("Welcome");
	}
	
	public void display1()
	{
		super.animalType="Bail";
		super.maxAge=10;
		System.out.println(super.animalType);
		System.out.println(super.maxAge);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="Cow";
		int y=15;
		Forest f=new Forest(x,y);
		f.display();
		f.display1();
	}

}
