package com.atos.java.exceptions;

import java.util.Scanner;

public class Array_Ex {

	public double divide(int dividend,int divisor)throws ArithmeticException
	{
		if(divisor==0)
		{
			throw new ArithmeticException("Divide by 0 error Shiva");
		}
		return dividend/divisor;
	}
	public static void main(String[] args) {
		
		Array_Ex e=new Array_Ex();
		System.out.println(e.divide(50, 0));
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		
//		try{
//			
//			try{
//		    System.out.println(50/a);
//			}
//			catch(ArithmeticException e)
//			{
//				System.out.println("Number cannot be divided by zero");
//			}
//			int arr[]={1};
//			arr[1]=12;
//		}
//		
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Array Size is Invalid");
//		}
//		finally
//		{
//			System.out.println("In Final Block");
//		}
//		System.out.println("Rest of the Code");
		
		
		

	}

}
