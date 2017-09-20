package com.atos.java.classess;

import java.util.Scanner;

public class Information extends Venue {
	
	public String showCity(String city)
	{
		return city;
	}
	
	@Override
	public String showGames(String game) {
		// TODO Auto-generated method stub
		return game;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Information in=new Information();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the game");
		String g=sc.next();
		System.out.println("Enter the city name");
		String c=sc.next();
		System.out.println(in.showGames(g)+" is played at "+in.showCity(c));
		in.disp();
		sc.close();

	}
}
