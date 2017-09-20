package com.atos.assignments.assign4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;



public class TestPatientList{
	
	static class EmployeeComparator implements Comparator<Patient>
	{

		@Override
		public int compare(Patient o1, Patient o2) {
			// TODO Auto-generated method stub
			return o1.getAge()-o2.getAge();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1=new Patient(101,"Pratik",22);
		Patient p2=new Patient(102,"Devendra",21);
		Patient p3=new Patient(103,"Shivkumar",20);
		
		ArrayList<Patient> p=new ArrayList<Patient>();
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		System.out.println("\nSort by id (Natural Sort) ::");
		Collections.sort(p);
		for(Patient pt:p)
		{
			System.out.println(pt.getPatientId()+"\t"+pt.getName()+"\t"+pt.getAge());	
		}
		
		System.out.println("\nSort by age (Alternative Sort) ::");
		Collections.sort(p,new EmployeeComparator());
		
		
		Iterator<Patient> it=p.iterator();
		while(it.hasNext())
		{
			Patient pn= it.next();
			System.out.println(pn.getPatientId()+"\t"+pn.getName()+"\t"+pn.getAge());	
		}
		
		TreeSet<Patient> ts=new TreeSet<Patient>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		
		System.out.println("\nDisplaying Tree Set ::");
		
		for(Patient ptn:ts)
		{
			System.out.println(ptn.getPatientId()+"\t"+ptn.getName()+"\t"+ptn.getAge());	
		}
		
		System.out.println("Enter name to find age ::");
		Scanner sc=new Scanner(System.in);
		int age=getPatientAge(sc.next(),ts);
		if(age!=0)
		{
			System.out.println("age is ::"+age);
		}
		else
		{
			System.out.println("Invalid name");
		}

	}
	
	public static int getPatientAge(String name,TreeSet<Patient> t)
	{
		for(Patient p:t)
		{
			if(p.getName().equalsIgnoreCase(name))
				return p.getAge();
		}
		
		return 0;
		
	}

}

/*  
 
 
Sort by id (Natural Sort) ::
102	Devendra	21
101	Pratik	22
103	Shivkumar	20

Sort by age (Alternative Sort) ::
103	Shivkumar	20
102	Devendra	21
101	Pratik	22

Displaying Tree Set ::
102	Devendra	21
101	Pratik	22
103	Shivkumar	20
Enter name to find age ::
Shivkumar
age is ::20


*/
