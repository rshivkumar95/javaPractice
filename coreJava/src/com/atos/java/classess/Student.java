package com.atos.java.classess;

import java.util.Arrays;

public class Student {
	
	private static int rollNo;
	private static String name;
	private static double score;
	static Address stuad;
	
	public Student(int rollNo, String name, double score,Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.score = score;
		
		this.stuad=ad;
	}
	
	public static void main(String[] args) {
		Address ad=new Address(10,"Nanded","Maharashtra","IN");
		new Student(1,"Pratik",98.7,ad);
		System.out.println("Roll No. :"+rollNo);
		System.out.println("Name :"+name);
		System.out.println("Score :"+score);
		System.out.println("Address :"+stuad.streetName+" "+stuad.city+" "+stuad.state+" "+stuad.country);
		
	}
	
	
	

}
