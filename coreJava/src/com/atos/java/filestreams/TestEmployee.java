package com.atos.java.filestreams;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestEmployee {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=new FileOutputStream("Employee.txt");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		Employee e=new Employee();
		e.setEmpid(1001);
		e.setEname("Shivkumar");
		os.writeObject(e);
		os.flush();
		os.close();
		
		FileInputStream fis=new FileInputStream("Employee.txt");
		ObjectInputStream is=new ObjectInputStream(fis);
		Employee e1=(Employee)is.readObject();
		System.out.println("Employee id: "+e1.getEmpid());
		System.out.println("Employee Name :"+e1.getEname());
		
		Date d=new Date();
		Calendar c=Calendar.getInstance();
		System.out.println(d+"\n"+c.getTime());
		
		
		String dateOut;
		Date today=new Date();
		DateFormat df=DateFormat.getDateInstance(DateFormat.DEFAULT,Locale.US);
		dateOut=df.format(today);
		System.out.println("Indian Date :: "+dateOut);
		
		
		Date today1=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("G");
		String output=sdf.format(01);
		System.out.println(output);
				
		
		
		int x=04;
		int y=03;
		int z=1995;
		String dfm=x+"/"+y+"/"+z;
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		try{
			Date d1=sdf1.parse(dfm);
			String output1=sdf1.format(d1);
			SimpleDateFormat sdf2=new SimpleDateFormat("E");
			System.out.println(sdf2.format(d1));
			//String arr[]={"Sun","Mon","Tues","Wedns","Thurs","Fri","Sat"};
			//System.out.println(arr[d1.getDay()]);
		}
		catch(ParseException e2)
		{
			e2.printStackTrace();
		}
		
	}

}
