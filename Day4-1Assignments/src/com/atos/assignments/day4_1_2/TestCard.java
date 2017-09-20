package com.atos.assignments.day4_1_2;

import java.util.Scanner;

public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TravelCard tc=new TravelCard();
		tc.availableBalance=10000;
		tc.cardNo=420;
		tc.swipeLimit=200;
		Scanner sc=new Scanner(System.in);
		
		int ch;
		System.out.println("Welcome to Travel Card");
		while(true){
			System.out.println(":: Options ::");
			System.out.println("1. View Details");
			System.out.println("2. Recharge");
			System.out.println("3. Swipe Card");
			System.out.println("4. Exit");
			System.out.println("Enter Option (1-4) ::");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Available Balance : "+tc.availableBalance);
				System.out.println("Card No :"+tc.cardNo);
				System.out.println("Reward Points :"+tc.rewardPoints);
				break;
				
			case 2:
				System.out.println("Enter Amount to recharge (In Dollers)");
				tc.rechargeCard(sc.nextDouble());
				System.out.println("Updated Balance :"+tc.availableBalance);
			   break;
			   
			case 3:
				System.out.println("Enter Amount to swipe (In Dollers)");
				if(!tc.swipeCard(sc.nextDouble()))
					System.out.println("Invalid Amount !");
				else
					System.out.println("Swipe Successful");
				break;
				
			case 4:
				  System.out.println("Thank you! Visit Again !");
				  System.exit(0);
				break;
			
			
			}
			
		}

	}

}

/* 
Welcome to Travel Card
:: Options ::
1. View Details
2. Recharge
3. Swipe Card
4. Exit
Enter Option (1-4) ::
1
Available Balance : 10000.0
Card No :420
Reward Points :0.0
:: Options ::
1. View Details
2. Recharge
3. Swipe Card
4. Exit
Enter Option (1-4) ::
3
Enter Amount to swipe (In Dollers)
3
180.0
5.0
Swipe Successful
:: Options ::
1. View Details
2. Recharge
3. Swipe Card
4. Exit
Enter Option (1-4) ::
1
Available Balance : 9811.0
Card No :420
Reward Points :5.0
:: Options ::
1. View Details
2. Recharge
3. Swipe Card
4. Exit
Enter Option (1-4) ::
2
Enter Amount to recharge (In Dollers)
2
Updated Balance :9931.0
:: Options ::
1. View Details
2. Recharge
3. Swipe Card
4. Exit
Enter Option (1-4) ::
1
Available Balance : 9931.0
Card No :420
Reward Points :5.0
:: Options ::
1. View Details
2. Recharge
3. Swipe Card
4. Exit
Enter Option (1-4) ::
4
Thank you! Visit Again !

*/
