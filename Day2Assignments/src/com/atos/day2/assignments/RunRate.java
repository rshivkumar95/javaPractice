package com.atos.day2.assignments;

import java.util.Scanner;


public class RunRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Overs Bowled :");
		int overB=sc.nextInt();
		System.out.println("Current Run Rate :");
		double curRR=sc.nextDouble();
		System.out.println("Target :");
		int target=sc.nextInt();
		
		System.out.println("Required run rate = "+ (target - (curRR * 10) )/ (50-overB));
		
		
	}

}

/*
 * 
 * 

Overs Bowled :
10
Current Run Rate :
4.2
Target :
250
Required run rate = 5.2

 * 
 * 
 */

