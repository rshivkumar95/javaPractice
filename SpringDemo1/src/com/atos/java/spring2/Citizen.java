package com.atos.java.spring2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Citizen {
	
	private String name;
	private Map<String,String> id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getId() {
		return id;
	}
	public void setId(Map<String, String> id) {
		this.id = id;
	}
	
	public void showinfo()
	{
		System.out.println("Citizen Name is "+name);
		
		System.out.println("Proof of ID are");
		Set<Entry<String,String>> set=id.entrySet();
		
		Iterator <Entry<String,String>> itr=set.iterator();
		
		while(itr.hasNext())
		{
			Entry<String,String> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
