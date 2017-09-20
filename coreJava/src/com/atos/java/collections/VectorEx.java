package com.atos.java.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(12);
		v.add(15);
		v.add(90);
		v.add(78);
		v.add(12);
		v.add(15);
		v.add(90);
		v.add(78);
		v.add(12);
		v.add(15);
		v.add(90);
		v.add(78);
		
		
		for(int i=0;i<v.size();i++)
		System.out.print(v.get(i)+" ");
		
		System.out.println("\n"+v.capacity());
		
		
		

	}

}
