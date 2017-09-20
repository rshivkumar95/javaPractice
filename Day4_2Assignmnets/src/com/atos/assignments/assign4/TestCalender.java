package com.atos.assignments.assign4;

import java.util.Calendar;
import java.util.Date;

public class TestCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c=Calendar.getInstance();
		System.out.println("Current time ::"+c.getTime());
		System.out.println("Year ::"+c.get(Calendar.YEAR));
		System.out.println("Date ::"+c.get(Calendar.DATE));
		c.add(Calendar.HOUR,2);
		System.out.println("Hour (After adding 2) ::"+c.get(Calendar.HOUR));
		c.add(Calendar.MINUTE, -5);
		System.out.println("Minutes (After removing 5) ::"+c.get(Calendar.MINUTE));
		Date d=c.getTime();
		System.out.println(d);

	}

}
