package com.atos.day2.assignments;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of dozens of egg purshed : ");
		float noOfDozen=input.nextInt();
		System.out.println("Enter the price per dozen :");
		float pricePerDozen= input.nextInt();
		System.out.println("Enter the selling price of 1 Egg :");
		float priceOfEgg= input.nextInt();
		float costPrice=pricePerDozen/12;
		System.out.println();
		float gain=priceOfEgg-costPrice;
		float profitPer=(gain/costPrice)*100;
		
		System.out.println("Profit Percentage is : "+profitPer);
		
	}

}

/*
 * 
Enter the number of dozens of egg purshed : 
20
Enter the price per dozen :
375
Enter the selling price of 1 Egg :
33

Profit Percentage is : 5.6000004

*/
