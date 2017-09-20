package com.atos.java.classess;

public abstract class Venue {
	
	public abstract String showCity(String city);
	public abstract String showGames(String game);
	void show(){
		System.out.println("Vital Information");
	}
	
	static void disp()
	{
		System.out.println("Disp");
	}

}
