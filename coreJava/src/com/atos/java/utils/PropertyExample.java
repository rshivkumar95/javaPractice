package com.atos.java.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyExample {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("messages.properties");
		
		Properties prop=new Properties();
		prop.load(fr);
		System.out.println(prop.getProperty("007"));
		System.out.println(prop.getProperty("420"));

	}

}
