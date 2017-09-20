package com.atos.assignments.day4_1_2;

public class TravelCard extends PrepaidCard implements Rewardable{

	
	
	
	double rewardPoints;
	
	
	@Override

	public boolean swipeCard(double amount) {
		// TODO Auto-generated method stub
		double inrAmount=amount*60;
		
		if(inrAmount>availableBalance || inrAmount>swipeLimit)
			return false;
		else
		{
			double pCharge=(inrAmount*0.05);
			availableBalance-=inrAmount+pCharge;
			rewardCalc(inrAmount);
			return true;
		}
	}
	@Override
	public double rewardCalc(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println(amount);
		rewardPoints+=(int)(amount/100)*5;
		System.out.println(rewardPoints);
		return rewardPoints;
	}

}
