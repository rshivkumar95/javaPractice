package com.atos.assignments.assign5;

import java.util.LinkedHashSet;

import com.atos.assignments.assign4.Patient;

public class TestPatientSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient p1=new Patient(101,"Pratik",22);
		Patient p2=new Patient(102,"Devendra",21);
		Patient p3=new Patient(103,"Shivkumar",20);
		
		LinkedHashSet<Patient> lhsp=new LinkedHashSet<Patient>();
		lhsp.add(p1);
		lhsp.add(p2);
		lhsp.add(p3);
		lhsp.add(p1); //Duplicate
		
		System.out.println("size of Set ::"+lhsp.size());
		
		
		for(Patient pnt:lhsp)
		{
			System.out.println(pnt.getPatientId()+"\t"+pnt.getName()+"\t"+pnt.getAge());
		}

	}

}

/* 
 
 size of Set ::3
101	Pratik	22
102	Devendra	21
103	Shivkumar	20

*/
