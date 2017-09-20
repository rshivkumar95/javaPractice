package assignment2;

import java.util.*;


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
