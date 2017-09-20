package com.atos.java.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		
		Student s=new Student();
		s.setName("shivkumar");
		
		UGStudent ug=new UGStudent();
		ug.setName("Devendra");
		ug.setMarks(85);
		ug.setGrade(8.5f);
		
		PGStudent pg=new PGStudent();
		pg.setName("Pratik");
		pg.setPoints(9.3f);
		pg.setSpecilization("Commerce");
		
		session.persist(s);
		session.persist(ug);
		session.persist(pg);
		
		t.commit();
		session.close();
		System.out.println("Sucess");
	}

}
