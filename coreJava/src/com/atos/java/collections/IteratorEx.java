package com.atos.java.collections;

import java.util.*;
public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myList=new ArrayList<Integer>();

		myList.add(12);
		myList.add(89);
		myList.add(78);
		myList.add(56);
		
		
		Iterator it=myList.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}

}
