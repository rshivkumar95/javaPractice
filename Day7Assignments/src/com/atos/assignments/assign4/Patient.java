package com.atos.assignments.assign4;

public class Patient implements Comparable<Patient>{
	private int patientId;
	private String name;
	private int age;
	public Patient(int patientId, String name, int age) {
		
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Patient o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

}
