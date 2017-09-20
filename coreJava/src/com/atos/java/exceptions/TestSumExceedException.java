package com.atos.java.exceptions;

import java.util.Scanner;

public class TestSumExceedException {

	
	static int sum(int a,int b)
	{
		int sum=a+b;
		if(sum>50)
		{
			try{
				throw new SumExceedException("Sum Exceeded 50");
			}
			catch(SumExceedException se){
				
				System.out.println(se.getMessage());
				System.exit(0);
			}
		}
		
		
			return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number ::");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("sum :"+TestSumExceedException.sum(a,b));
		
		
		

	}

}
