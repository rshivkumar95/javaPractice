package com.atos.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TraineeTest {
	
	public static void searchTrainee(ArrayList<Trainee> t1,String name)
	{
		Trainee t=new Trainee();
		boolean flag=true;
		Iterator<Trainee> i=t1.iterator();
		
		while(i.hasNext())
		{
			t=i.next();
			if(t.getName().equalsIgnoreCase(name) && flag)
			{
				System.out.println(t.getSalCode()+" "+t.getName()+" "+t.getScore());
				flag=false;
			}						
		}
		if(flag)
		{
			System.out.println("Trainee Not Found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Trainee> traineeList=new ArrayList<Trainee>();
		
		traineeList.add(new Trainee(1,"Pratik",98));
		traineeList.add(new Trainee(2,"Akash",65));
		traineeList.add(new Trainee(3,"Prashant",89));
		traineeList.add(new Trainee(4,"Akash",80));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name To Be Search");
		String name=sc.next();
		TraineeTest.searchTrainee(traineeList, name);
		sc.close();
	}

}
