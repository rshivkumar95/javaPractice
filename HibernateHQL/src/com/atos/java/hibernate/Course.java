package com.atos.java.hibernate;




import java.io.Serializable;

import javax.persistence.*;



@Entity
public class Course implements Serializable{
	
	@Id @GeneratedValue @Column(name = "C_ID")
	private Long id;
	private String name;
	private int duration;
	public Course() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
