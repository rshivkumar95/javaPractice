package com.atos.java.exceptions;

import java.util.Scanner;

public class User_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String username=sc.next();
		int age=sc.nextInt();
		
		//Age_Valid_Exception a=new Age_Valid_Exception();
		if(age>100)
		{
		try{
		  throw new Age_Valid_Exception("Invalid Age");
		}
		catch(Age_Valid_Exception ae)
		{
			System.out.println(ae.getMessage());
		}
		}
		else
		{
			System.out.println("Valid Age");
		}

	}

}
