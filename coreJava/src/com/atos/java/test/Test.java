package com.atos.java.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		
		Scanner sc=new Scanner(System.in);
		
		int count=sc.nextInt();
		
		while(count--!=0)
		{
			int num=sc.nextInt();
			ArrayList<Integer> cnt=new ArrayList<Integer>();
			while(num--!=0)
			{
				cnt.add(sc.nextInt());
			}
			arr.add(cnt);
		}
		
		count=sc.nextInt();
		while(count--!=0)
		{
			
			ArrayList<Integer> cnt=arr.get(sc.nextInt()-1);
			int loc=sc.nextInt();
			if(loc>cnt.size())
			{
				System.out.println("ERROR!");
			}
			else
			{
				System.out.println(cnt.get(loc-1));
			}
			
			
			
		}
		
		
		
		
		

	}

}