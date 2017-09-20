package com.atos.java.pract;

public class Dog {

	public static void main(String[] args) {
		try{
			int i = Integer.parseInt("xy");
			System.out.println(i);
			}catch(NumberFormatException e){
			System.out.print("a");
			}catch(ArithmeticException e){
			System.out.print("b");
			}catch(RuntimeException e){
			System.out.print("c");
			}finally{
			System.out.print("d");
			}
	}
}
