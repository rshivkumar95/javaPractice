package com.atos.java.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class EmpExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setEmpno(117);
		e1.setName("Shiva");
		
		session.persist(e1);
		
		t.commit();
		session.close();
		
		System.out.println("successfully saved");
		

	}

}
