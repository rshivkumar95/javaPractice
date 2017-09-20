package com.atos.java.collections;

import java.util.*;
public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Integer> s=new HashSet<Integer>();
		
		s.add(24);
		s.add(90);
		s.add(56);
		s.add(90);
		s.add(23);
		s.add(50);
		s.add(67);
		s.add(98);
		s.add(122);
		s.add(45);
		s.add(49);
		
		System.out.println(s);
		
		System.out.println(s.contains(977));

	}

}
