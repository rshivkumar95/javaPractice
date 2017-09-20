package com.atos.day2.assignments;

import java.util.Scanner;

public class SpecialSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=2,second=1,third=3;
		int sum=0;
		System.out.print("2 "+"1 "+"3");
		while(true)
		{
			sum=first+second+third;
			if(sum>n)
				return;
			System.out.print(" "+sum);
			first=second;
			second=third;
			third=sum;
			
		}	

	}

}

/*
 20
2 1 3 6 10 19  
 *  */
 