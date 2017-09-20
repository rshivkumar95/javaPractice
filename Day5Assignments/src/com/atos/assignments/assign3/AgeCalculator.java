package com.atos.assignments.assign3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator {
	
	public static int calculateAge(String date) 
	{
		
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		
		Date d=new Date();
		try {
			d = df.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Date is not in dd/MM/yyyy");
			System.exit(0);
		}
		Date now=new Date();
		if(d.compareTo(now)==1)
		{
			try{
				throw new InvalidDOBException("DOB cannot be after current date");	
			}
			catch(InvalidDOBException id)
			{
				System.out.println(id.getMessage());
				System.exit(0);
			}
		}
		int years=now.getYear()-d.getYear();
		int months;
		if(now.getMonth()<d.getMonth())
		{
			years--;
		}
		
			
		
			
		//int month=now.getMonth()-d.getMonth();
		
		return years;
		
	}

}
