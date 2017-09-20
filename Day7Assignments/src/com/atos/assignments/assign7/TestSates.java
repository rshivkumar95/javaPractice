package com.atos.assignments.assign7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSates {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> stateSet=new LinkedHashSet<String>();
		
		BufferedReader br=new BufferedReader(new FileReader("states.txt"));
		
		String curLine;
		while((curLine=br.readLine())!=null)
		{
			stateSet.add(curLine);
		}
		
		System.out.println("total states ::"+stateSet.size());
		stateSet.remove("Delhi");
		System.out.println("Delhi Removed");
		System.out.println("State Starting from K ::");
		for(String k:stateSet)
		{
			if(k.startsWith("K"))
				System.out.println(k);
		}
		
		TreeSet<String> ts=new TreeSet<String>();
		for(String k:stateSet)
		{
			ts.add(k);
		}
		System.out.println("Sorted list ::");
		for(String k:ts)
		{
			System.out.println(k);
		}
		
		
	}

}

/* 

total states ::8
Delhi Removed
State Starting from K ::
Karnataka
Kerala
Sorted list ::
Karnataka
Kerala
Maharashtra
Punjab
TamilNadu
Telangana
UttarPradesh

*/
