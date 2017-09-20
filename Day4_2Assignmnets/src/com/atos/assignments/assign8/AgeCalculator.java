package com.atos.assignments.assign8;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator {
	
	public static String calculateAge(String date) throws ParseException
	{
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		//Calendar c=Calendar.getInstance();
		Date d=df.parse(date);
		//int diff=c.
		Date now=new Date();
		
		//Date d=df.parse(date);
		
		int years=now.getYear()-d.getYear();
		int months;
		if(now.getMonth()<d.getMonth())
		{
			years--;
			months=12-(d.getMonth()-now.getMonth());
		}
		else
		{
			months=now.getMonth()-d.getMonth();
		}
			
		
			
		//int month=now.getMonth()-d.getMonth();
		
		return years+" year(s) "+months+" month(s)";
		
	}

}
