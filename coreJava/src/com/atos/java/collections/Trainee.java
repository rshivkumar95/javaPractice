package com.atos.java.collections;

public class Trainee {
	
	private int salCode;
	private String name;
	private int score;
	
	
	public Trainee() {
		
	}

	public Trainee(int salCode, String name, int score) {
	
		this.salCode = salCode;
		this.name = name;
		this.score = score;
	}
	
	public int getSalCode() {
		return salCode;
	}
	public void setSalCode(int salCode) {
		this.salCode = salCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	

}
