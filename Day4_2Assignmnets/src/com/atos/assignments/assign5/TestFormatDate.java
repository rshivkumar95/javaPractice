package com.atos.assignments.assign5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFormatDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/YYYY");
		SimpleDateFormat df2=new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		System.out.println(df.format(d));
		System.out.println(df2.format(d));

	}

}
