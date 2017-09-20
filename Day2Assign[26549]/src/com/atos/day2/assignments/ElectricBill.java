package com.atos.day2.assignments;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the previous reading : ");
		int preUnit=input.nextInt();
		System.out.println("Enter the Current reading :");
		int currentUnit= input.nextInt();
		int billingUnit=currentUnit-preUnit;
		float billAmount=0;
		if(billingUnit<=30)
		{
			billAmount=(float) (2.3*billingUnit);
		}
		else if(billingUnit<=100)
		{
			billAmount=(float) (30*2.3);
			billingUnit-=30;
			billAmount+=(float) (billingUnit*3.5);
		}
		else
		{
			billAmount=(float) (30*2.3);
			billingUnit-=30;
			billAmount+=(float) (70*3.5);
			billingUnit-=70;
			billAmount+=(float) (billingUnit*4.6);
			
			
		}
		System.out.println("Bill Unit : "+billingUnit+"\nBill Amount Is :"+billAmount);

	}

}

/* Enter the previous reading : 
1000
Enter the Current reading :
1251
Bill Unit : 151
Bill Amount Is :1008.6

*/
