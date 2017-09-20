package com.atos.assignments.assign7;

import java.util.Scanner;

public class TestVerifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password ::");
		
		if(Verifier.verifyPassword(sc.next()))
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid Password");
		}
		

	}

}
