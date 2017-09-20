package com.atos.java.multithreading;


public class ThreadDemo{

//	public void run()
//	{
//		System.out.println("Multithreading . . .");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=new Thread();
		Thread t1=new Thread();
		
		
		System.out.println("Current Thread :"+t);
		t.setName("AJO48");
		System.out.println("After Name Change :"+t);
		
		System.out.println(t.getClass());
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getPriority());
		System.out.println(t.hashCode());
		System.out.println(t.isAlive());
		System.out.println(t.isInterrupted());
		System.out.println(t.getState());
		System.out.println(t.getThreadGroup());
		System.out.println(t.equals(t1));
		
		

	}

}
