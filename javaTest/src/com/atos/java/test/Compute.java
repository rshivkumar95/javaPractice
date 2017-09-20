package com.atos.java.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Compute {
	
	final static Logger log=Logger.getLogger(Compute.class);
	
	public int addSum(int x,int y)
	{
		return x/y;
	}
	
	public void Greet()
	{
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		//BasicConfigurator.configure();
		
		log.info("Object is going to get created for compute class");
		Compute c=new Compute();
		log.info("Object is created for Compute Class");
		log.info("Greet Method is invoked");
		c.Greet();
		
		try{
			c.addSum(45, 0);
			
		}catch(Exception e)
		{
			log.error(e.getMessage());
		}
	}

}
