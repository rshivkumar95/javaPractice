package com.atos.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashMap<Integer,Double> hm=new HashMap<>();
//		hm.put(1, new Double(25000.45));
//		hm.put(2, new Double(35000.75));
//		hm.put(4, new Double(56999.97));
//		hm.put(3, new Double(23567.89));
//		hm.put(4, new Double(90999.97));
//		Set<Integer> s=hm.keySet();
//		Iterator<Integer> i=s.iterator();
//		while(i.hasNext())
//		{
//			Integer x=(Integer)i.next();
//			System.out.println(hm.get(x));
//		}
		
		
		HashMap<String,Integer> m1=new HashMap<>();
		HashMap<String,String> m2=new HashMap<>();
		
		m1.put("Shivkumar", 98);
		m1.put("Devendra", 60);
		m1.put("Pratik", 65);
		m1.put("Akash", 40);
		
		System.out.println(m1);
		
		Set<String> s=m1.keySet();
		Iterator<String> si=s.iterator();
		while(si.hasNext())
		{
			String key=si.next();
			if(m1.get(key)>=60)
			{
				m2.put(key, "Pass");								
			}
			else
			{
				m2.put(key, "Fail");
			}
		}
		
		
		System.out.println(m2);
		
		
	}

}
