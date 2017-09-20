package com.atos.java.collections;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> st=new LinkedList<Integer>();
//		
//		st.add("Shivkumar");
//		st.add("Pratik");
//		st.add("Deva");
//		System.out.println(st);
//		st.addFirst("Akash");
//		System.out.println(st);
//		st.addLast("Mujahid");
//		System.out.println(st);
//		st.add(3,"Prashant");
//		System.out.println(st);
//		st.removeFirst();
//		System.out.println(st);
//		System.out.println(st.removeLast());
//		System.out.println(st);
//		
//		for(String a:st)
//		{
//			System.out.println(a);
//		}
//		
//		Iterator it=st.iterator();
//		System.out.println("\n\n");
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		st.add(25);
		st.add(30);
		st.add(11);
		st.add(18);
		st.add(26);
		

		int k=0;
//		for(String str:st)
//		{
//			if(k%2==0)
//				System.out.println(str);
//			k++;
//		}
//		System.out.println("Other Method");
		for(int i=0;i<st.size();i++)
		{
			if(st.get(i)%2==0)
			 System.out.println(st.get(i));
		}
		
		
		
		

	}

}
