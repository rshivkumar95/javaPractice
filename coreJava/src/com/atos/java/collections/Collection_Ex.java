package com.atos.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection_Ex{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List a=new ArrayList();
		
		//ArrayList<String> a=new ArrayList<String>();
		a.add(15);
		a.add(13);
		
		System.out.println(a);
		a.add(15);
		System.out.println(a);
		a.add(null);
		a.add(null);
		System.out.println(a);
		a.add(2,115);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
	  System.out.println(a.contains(34));
	  System.out.println(a.isEmpty());
	  
	  
	  ArrayList lst1=new ArrayList();
	  lst1.add(56);
	  lst1.add(78);
	  System.out.println(lst1);
	  a.addAll(lst1);
	  System.out.println(a);
	  a.removeAll(lst1);
	  System.out.println(a);
	  
	  System.out.println(a.indexOf(null));
	  
	  Scanner sc=new Scanner(System.in);
	 
	  
	  

	}

}
