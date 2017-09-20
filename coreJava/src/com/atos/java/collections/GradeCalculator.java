package com.atos.java.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;

public class GradeCalculator {

public static void main(String []args){

	//fill your code here
	
	HashMap<Integer,Integer> m1=new HashMap<>();
	
	Scanner sc=new Scanner(System.in);
	int count=sc.nextInt();
	for(int i=0;i<count;i++)
	{
		m1.put(sc.nextInt(), sc.nextInt());
		
	}
	
	
	TreeMap<Integer, String> tm=new TreeMap<>();

	tm=Usermaincode.calculateGrade(m1);
	Set<Integer> s1=tm.keySet();
	Iterator<Integer> si=s1.iterator();
	
	while(si.hasNext())
	{
		int key=si.next();
		System.out.println(key+""+tm.get(key));
	}
	
	
}
}


class Usermaincode
{
public static TreeMap<Integer,String> calculateGrade (HashMap<Integer,Integer>hm)
{
	TreeMap<Integer, String> tm=new TreeMap<>();
	
	Set<Integer> s=hm.keySet();
	Iterator<Integer> si=s.iterator();
	while(si.hasNext())
	{
		int key=si.next();
		if(hm.get(key)>=80)
		{
			tm.put(key, "GOLD");								
		}
		else if(hm.get(key)<80 && hm.get(key)>=60)
		{
			tm.put(key, "SILVER");
		}
		else if(hm.get(key)<60 && hm.get(key)>=45)
		{
			tm.put(key, "SILVER");
		}
		else
		{
			tm.put(key, "FAIL");
		}
	
	}
	
	return tm;
	//fill your code here
	
}
}