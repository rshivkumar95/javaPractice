package com.atos.java.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Spouse s=new Spouse();
		s.setSpid(1001);
		s.setName("Twinkle");
		Person p=new Person();
		p.setCode(101);
		p.setName("Akshay");
		p.setS(s);
		
		Transaction tx=session.beginTransaction();
		
		session.save(p);
		
		tx.commit();
		
		session.close();
		System.out.println("One to one is done");
		factory.close();
		
	}

}
