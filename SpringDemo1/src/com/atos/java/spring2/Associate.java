package com.atos.java.spring2;

import java.util.Iterator;
import java.util.List;

public class Associate {
	
	private int id;
	private String name;
	private List<String> modules;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getModules() {
		return modules;
	}
	public void setModules(List<String> modules) {
		this.modules = modules;
	}
	
	public void show(){
		System.out.println(this.id);
		System.out.println(this.name);
		Iterator<String> it=modules.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
