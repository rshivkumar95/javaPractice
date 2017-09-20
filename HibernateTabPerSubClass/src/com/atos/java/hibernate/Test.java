package com.atos.java.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();		
		Transaction t=session.beginTransaction();
		
		Departments d=new Departments();
		d.setName("IT");
		
		Employee e=new Employee();
		e.setEname("Shivkumar");
		e.setSalary(8.00f);
		
		Location l=new Location();
		l.setHodname("Devendra");
		l.setLoc("Pune");
		
		session.persist(d);
		session.persist(e);
		session.persist(l);
		
		t.commit();
		session.close();
		
		System.out.println("Success");
		

	}

}
