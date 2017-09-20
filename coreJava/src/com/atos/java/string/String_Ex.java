package com.atos.java.string;

public class String_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String s1="Manipal";
		String s2=new String("Education");
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		System.out.println(s1.charAt(5));
		System.out.println("MANIPAL".equals(s1));
		System.out.println("MANIPAL".equalsIgnoreCase(s1));		
		System.out.println(s1.substring(2));
		
		StringBuilder sb1=new StringBuilder("Manipal");
		System.out.println(sb1.append("Education"));
		
		StringBuilder sb2=new StringBuilder("Training");
		System.out.println(sb2.deleteCharAt(0));
		
		StringBuilder sb3=new StringBuilder("raining");
		System.out.println(sb3.insert(0,"T"));
		
		StringBuilder sb4=new StringBuilder("Shivkumar");
		System.out.println(sb4.reverse());
		
		
		
		
	}

}
