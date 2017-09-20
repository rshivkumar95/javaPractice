package com.atos.assignments.assign6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatChanger {
	
	public static String changeFormat(String date) throws ParseException
	{
		
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		Date d=df.parse(date);
		SimpleDateFormat df1=new SimpleDateFormat("yyyy-MM-dd");
		return df1.format(d).toString();
	}

}
