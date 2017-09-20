package com.atos.assignments.day4_1_2;

public abstract class PrepaidCard {
	
	public int cardNo;
	public double availableBalance;
	public double swipeLimit=200;
	
	
	public abstract boolean swipeCard(double amount);
	
	public String toString()
	{
		return ":: Details ::\nCard No. :"+cardNo+"\nAvailable Balance :"+availableBalance+"\nSwipe Limit :"+swipeLimit;
	}
	
	public void rechargeCard(double amount)
	{
		
		this.availableBalance+=(amount*60);
		
	}
	
}

